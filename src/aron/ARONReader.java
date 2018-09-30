package aron;
/**
	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011, 2018 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 2002/06/08 Jason Osgood <mrosgood@yahoo.com>
	Rewritten: 2011/10/01 Jason Osgood <jason@jasonosgood.com> 
 	Updated: 2018/07/05 Jason Osgood <jason@jasonosgood.com>

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import static aron.ARONParser.*;
import static aron.unescape.unescape;

// TODO: Report missing bean method

public class ARONReader
{
	private ArrayList<String> _importDefs;
	private HashMap<String, Class<?>> _shortNames;

	// Not statics, because SDF is not threadsafe and George would complain
	private  List<SimpleDateFormat> _formatters;
	{
		var patterns = new String[] {
			"yyyy-MM-dd'T'HH:mm:ss.SSSX",
			"yyyy-MM-dd'T'HH:mm:ssX",
			"yyyy-MM-dd'T'HH:mm:ss.SSS",
			"yyyy-MM-dd'T'HH:mm:ss",
			"yyyy-MM-dd'T'HH:mm",
			"yyyy-MM-dd"
		};

		_formatters = new ArrayList<>();

		for( String p : patterns )
		{
			var sdf = new SimpleDateFormat( p, Locale.ROOT );
			sdf.setTimeZone( TimeZone.getTimeZone( "UTC" ));
			_formatters.add( sdf );
		}
	};

	public ARONReader()
	{
		_importDefs = new ArrayList( 4 );
		_shortNames = new HashMap();
	}

	private URI _uri = null;
	
	public Document read( File file )
		throws Exception
	{
		URI uri = file.getCanonicalFile().toURI();
		return read( uri );
	}
 
	public Document read( URL url )
		throws Exception
	{
		URI uri = url.toURI();
		return read( uri );
	}

	public URI source;

	public Document read( URI uri )
		throws Exception
	{
		source = uri;
		System.out.println( uri );

		_uri = uri;
		InputStream in = uri.toURL().openStream();
		return read( in );
	}

	public Document read( InputStream in )
		throws Exception
	{
		CharStream cs = CharStreams.fromStream( in );
		Document root = read( cs );
		return root;
	}

	public static Document read( String str )
		throws Exception
	{
		CharStream cs = CharStreams.fromString( str );
		Document root = new ARONReader().read( cs );
		return root;
	}

	private Document read( CharStream cs )
		throws Exception
	{
		doc = new Document( source );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens );

		DocumentContext t = parser.document();
		return process( t );
	}

	Document doc;

	public Document process( DocumentContext rc )
		throws Exception
	{
		for( IncludeContext ic : rc.include() )
		{
            includes( ic );
		}

		for( ImportDeclContext idc : rc.importDecl() )
		{
			imports( idc );
		}

		for( MapContext child : rc.map() )
		{
			processMap( doc, "child", child );
		}
		
		for( OverrideContext override : rc.override() )
		{
			override( override );
		}

		return doc;
	}

	public void includes( IncludeContext ic )
		throws Exception
	{
		String url = ic.Url().getText();
		System.out.println( "include: " + url );

		Path parent = Paths.get( _uri );
		Path sibling = parent.resolveSibling( url );
		File file = sibling.toFile();	
		if( file.exists() )
		{
			ARONReader aron = new ARONReader();
			Document include = aron.read( file );
			doc.addInclude( include );
		}
		else
		{
			throw new FileNotFoundException( file.toString() );
		}
	}

	public void imports( ImportDeclContext imports )
		throws ClassNotFoundException
	{
		ClassNameContext id = imports.className();
		String name = id.getText();
		Class<?> clazz = Class.forName( name );
		int nth = clazz.toString().lastIndexOf( (int) '.' );
		String shortie = clazz.toString().substring( nth + 1 );
		_shortNames.put( shortie, clazz );
	}

	/*
		interface Map & no className -> new LinkedHashMap
		Map subclass & no className -> new Map subclass
		interface (or abstract) & className -> new className
		class & no className -> new class
	 */
	String defaultMapClassName = "java.util.LinkedHashMap";

	class Setter
	{
		Method method;
		Class<?> type;
	}

	Setter findSetter( Object bean, String property, ClassNameContext cnc ) throws
		ClassNotFoundException
	{
		String[] names = likelySetterNames( property );

		List<Method> methods = new ArrayList<>();

		for( Method m : bean.getClass().getMethods() )
		{
			for( String name : names )
			{
				if( m.getName().equals( name ) && m.getParameterTypes().length == 1 )
				{
					methods.add( m );
				}
			}
		}

		Setter setter = null;

		// Explicit class name
		if( cnc != null )
		{
			var childClassName = cnc.getText();
			var temp = resolveClass( childClassName );
			setter = findExactMethod( methods, temp );
		}

		if( setter == null )
		{
			setter = inferMethod( methods );
		}

		// Use default className
		if( setter == null )
		{
			var defaultMapClass = resolveClass( defaultMapClassName );
			setter = findExactMethod( methods, defaultMapClass );
		}

		// TODO throw method not found exception
		return setter;
	}

	Setter findExactMethod( List<Method> methods, Class<?> type )
	{
		for( Method m : methods )
		{
			Class<?> actual = m.getParameterTypes()[0];
			if( actual.isAssignableFrom( type ))
			{
				Setter match = new Setter();
				match.method = m;
				match.type = type;
				return match;
			}
		}
		return null;
	}

	Setter inferMethod( List<Method> methods )
	{
		for( Method m : methods )
		{
			Class<?> actual = m.getParameterTypes()[0];
			// TODO: Verify not abstract
			// https://stackoverflow.com/questions/19249448/how-do-i-get-only-instantiable-classes-with-reflections#19249616
			if( actual != Object.class && !actual.isInterface() )
			{
				Setter match = new Setter();
				match.method = m;
				match.type = actual;
				return match;
			}
		}
		return null;
	}

	// TODO: support fields
	// TODO: support array as field
	public void processMap( Object parent, String property, MapContext context )
		throws 
			ARONException,
			ClassNotFoundException, InstantiationException, IllegalAccessException, 
			IllegalArgumentException, NoSuchMethodException, InvocationTargetException
	{

		Setter setter = findSetter( parent, property, context.className() );

		// TODO: verify a zero param constructor exists
		Constructor<?> constructor = setter.type.getConstructor();
		var child = constructor.newInstance();

		Object ignore = setter.method.invoke( parent, child );

		String alias = context.alias() != null ? context.alias().Word().getText() : null;
		doc.putAlias( alias, child );

		for( PairContext pair : context.pair() )
		{
			String key = pair.key().getText();
			ValueContext value = pair.value();
			processValue( child, key, value );
		}
	}

	public String[] likelySetterNames( String property )
	{
		return new String[]
		{
			property,
			"set" + capitalize( property ),
			"set" + property.toUpperCase(),
			capitalize( property ),
			property.toUpperCase(),
			"add" + capitalize( property ),
			"add" + property.toUpperCase()
		};
	}

	public void override( OverrideContext context )
		throws Exception
	{
		String alias = context.reference().Word().getText();
		String key = context.key().Word().getText();
		ValueContext vc = context.value();

		Object found = doc.getAlias( alias );

		if( found != null )
		{
			processValue( found, key, vc );
		}
	}
	
	public void processValue( Object bean, String method, ValueContext value )
		throws
			ARONException,
			ClassNotFoundException,
			NoSuchMethodException,
			InvocationTargetException,
			InstantiationException,
			IllegalAccessException
	{
		if( value.map() != null )
		{
			processMap( bean, method, value.map() );
			return;
		}

		if( value.scalar() != null )
		{
			Object scalar = processScalar( value.scalar() );
			setter( bean, method, scalar );
			return;
		}

		if( value.list() != null )
		{
			processList( bean, method, value.list() );
			return;
		}
	}

	public void setter( Object bean, String property, Object value )
		throws 
			NoSuchMethodException, IllegalArgumentException, 
			IllegalAccessException, InvocationTargetException
	{
		if( bean instanceof Map )
		{
			Map map = (Map) bean;
			map.put( property, value );
			return;
		}

		Class type = null;
		if( value != null ) {
			type = value.getClass();
		}

		String[] names = likelySetterNames( property );

		for( Method method : bean.getClass().getMethods() )
		{
			for( String name : names )
			{
				if( method.getName().equals( name ))
				{
					for( Class<?> oof : method.getParameterTypes() )
					{
						oof = toBoxingClass( oof );

						if( oof.isEnum() )
						{
							Class<? extends Enum> enumType = (Class<? extends Enum>) oof;
							final Enum<?> theOneAndOnly = Enum.valueOf(enumType, (String) value);
							Object ignored = method.invoke( bean, theOneAndOnly );
							return;
						}

						// Types are compatible OR we're just setting to null
						if( oof.isAssignableFrom( type ) || value == null )
						{
							Object result = method.invoke( bean, value );
							return;
						}

						break;
					}
				}
			}
		}

		throw new NoSuchMethodException( bean.getClass().getName() + "." + names[0] + "(" + type.getName() + ")" );
	}

	public Class<?> toBoxingClass( Class<?> oof )
	{
		switch( oof.getName() )
		{
			case "int":
				oof = Integer.class;
				break;

			case "float":
				oof = Float.class;
				break;

			case "boolean":
				oof = Boolean.class;
				break;

			default:
				break;
		}
		return oof;
	}

	public Object getter( Object instance, String bean )
		throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		String name = "get" + capitalize( bean );
		
		for( Method method : instance.getClass().getMethods() )
		{
			if( method.getName().equals( name ))
			{
				return method.invoke( instance );
			}
		}
		
		throw new NoSuchMethodException( instance.getClass().getName() + "." + name + "()" );
	}
		
	public Object processScalar( ScalarContext value )
		throws IllegalArgumentException
	{
		if( value.Boolean() != null )
		{
			String text = value.Boolean().getText();
			Boolean x = java.lang.Boolean.valueOf( text );
			return x;
		}

		if( value.Integer() != null )
		{
			String text = value.Integer().getText();
			Integer x =  java.lang.Integer.valueOf( text );
			return x;
		}

		if( value.Float() != null )
		{
			String text = value.Float().getText();
			Float x =  java.lang.Float.valueOf( text );
			return x;
		}

		if( value.String() != null )
		{
			String x = value.String().getText();
			x = x.substring( 1, x.length() - 1 );
			String y = unescape( x );
			return y;
		}

		if( value.Timestamp() != null )
		{
			String text = value.Timestamp().getText();
			Date x = parseDate( text );
			return x;
		}

		if( value.reference() != null )
		{
			String alias = value.reference().Word().getText();
			Object found = doc.getAlias( alias );
			if( found == null )
			{
				throw new IllegalArgumentException( "Alias '" + alias + "' not found" );
			}
			return found;
		}

		if( value.enumName() != null )
		{
			String name = value.enumName().Word().getText();
			return name;
		}

		return null;
	}

	// TODO: initialize null list references
	public void processList( Object bean, String property, ListContext node )
		throws
		NoSuchMethodException,
		IllegalArgumentException,
		IllegalAccessException,
		InvocationTargetException,
		InstantiationException,
		ARONException,
		ClassNotFoundException
	{
		Object temp = getter( bean, property );

		if( temp == null )
		{
			throw new NullPointerException( bean.getClass().getName() + ".get" + capitalize( property ) + "() returned null" );
		}

		if( !( temp instanceof Collection ))
		{
			String msg = bean.getClass().getName() + ".get" + capitalize( property ) + "() does not return a subclass of java.util.Collection";
			throw new IllegalArgumentException( msg );
		}

		Collection collection = (Collection) temp;

		if( !node.Boolean().isEmpty() )
		{
			for( TerminalNode tn : node.Boolean() )
			{
				String text = tn.getText();
				Boolean value = java.lang.Boolean.parseBoolean( text );
				collection.add( value );
			}
			return;
		}

		if( !node.Integer().isEmpty() )
		{
			for( TerminalNode tn : node.Integer() )
			{
				String text = tn.getText();
				Integer value = java.lang.Integer.parseInt( text );
				collection.add( value );
			}
			return;
		}

		if( !node.Float().isEmpty() )
		{
			for( TerminalNode tn : node.Float() )
			{
				String text = tn.getText();
				Float value = java.lang.Float.parseFloat( text );
				collection.add( value );
			}
			return;
		}

		if( !node.String().isEmpty() )
		{
			for( TerminalNode tn : node.String() )
			{
				String value = tn.getText();
				value = value.substring( 1, value.length() - 1 );
				String y = unescape( value );
				collection.add( y );
			}
			return;
		}

		if( !node.Timestamp().isEmpty() )
		{
			for( TerminalNode tn : node.Timestamp() )
			{
				String text = tn.getText();
				Date value =  parseDate( text );
				collection.add( value );
			}
			return;
		}

		if( !node.map().isEmpty() )
		{
			for( MapContext kid : node.map() )
			{
				processMap( collection, "add", kid );
			}
			return;
		}

		// empty list clears existing collection
		collection.clear();
		return;
	}
	
	public Class<?> resolveClass( String name )
		throws ClassNotFoundException
	{
		// First see if we can get a hit on the short name
		Class<?> result = _shortNames.get( name );

		if( result == null )
		{
			try
			{
				result = Class.forName( name );
			}
			catch( ClassNotFoundException cnfe ) {}
		}

        if( result == null )
        {
			Iterator<String> i = _importDefs.iterator();

			boolean success = false;

			while( i.hasNext() && !success )
			{
				String packageName = i.next();
				String biggerName = packageName + "." + name;
				try
				{
			        result = Class.forName( biggerName );
					success = true;

					int nth = result.toString().lastIndexOf( (int) '.' );
					String shortie = result.toString().substring( nth + 1 );
					_shortNames.put( shortie, result );
				}
				catch( ClassNotFoundException cnfe ) {}
			}
        }
        if( result == null )
        {
        	throw new ClassNotFoundException( name );
        }
        return result;
	}	
	
    private String capitalize( String propertyName ) 
    {
        if (propertyName.length() == 0) return null;
        return propertyName.substring( 0, 1 ).toUpperCase() + propertyName.substring( 1 );
    }
    
    public Date parseDate( String text )
    	throws DateFormatException
    {
		for( SimpleDateFormat formatter : _formatters )
		{
			try 
			{
				Date date = formatter.parse( text );
				return date;
			} 
			catch( ParseException e ) 
			{
				// do nothing
			}
		}
		throw new DateFormatException( text );
    }
}
