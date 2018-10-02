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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
	private List<String> _importDefs;
	private Map<String, Class<?>> _shortNames;

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

		_importDefs = new ArrayList<>( 4 );
		_shortNames = new HashMap<>();
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

		for( MapContext mc : rc.map() )
		{
			Object child = processMap( doc, "children", mc );
			doc.getChildren().add( child );
		}
		
		for( OverrideContext oc : rc.override() )
		{
			override( oc );
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
	Class<?> defaultMapClass = java.util.LinkedHashMap.class;
	Class<?> defaultCollectionClass = java.util.ArrayList.class;
	Class<?> currentClass = java.util.LinkedHashMap.class;

	public Object createChild( String alias, Class<?> c )
		throws
		NoSuchMethodException,
		IllegalAccessException,
		InvocationTargetException,
		InstantiationException
	{
		if( c.isInterface() )
		{
			if( Map.class.isAssignableFrom( c ))
			{
				c = defaultMapClass;
			}
			else if( Collection.class.isAssignableFrom( c ))
			{
				c = defaultCollectionClass;
			}
		}

		// TODO: verify a zero param constructor exists
		// TODO: verify instantiable (not interface, not abstract)
		Constructor<?> constructor = c.getConstructor();
		Object child = constructor.newInstance();
		doc.putAlias( alias, child );
		return child;
	}

	// TODO: support fields
	// TODO: support array as field
	public Object processMap( Object parent, String property, MapContext mc )
		throws Exception
	{
		String alias = mc.alias() != null ? mc.alias().Word().getText() : null;

		Class<?> c = null;
		Class<?> savedClass = null;

		if( mc.className() != null )
		{
			String className = mc.className().getText();
			c = resolveClass( className );
		}
		else
		{
			Type t = inferClass( parent, property );
			if( t != null )
			{
				if( t instanceof ParameterizedType )
				{
					c = (Class<?>) ((ParameterizedType) t).getRawType();
					if( Map.class.isAssignableFrom( c ))
					{
						savedClass = (Class<?>) ((ParameterizedType) t).getActualTypeArguments()[1];
					}
					else if( Collection.class.isAssignableFrom( c ))
					{
						savedClass = (Class<?>) ((ParameterizedType) t).getActualTypeArguments()[0];
					}
				}
				else
				{
					c = (Class<?>) t;
				}
			}
			else
			{
				c = currentClass;
			}
		}

		Object child = createChild( alias, c );

		if( savedClass != null )
		{
			Class<?> temp = savedClass;
			savedClass = currentClass;
			currentClass = temp;
		}

		for( PairContext pc : mc.pair() )
		{
			String key = pc.key().getText();
			ValueContext vc = pc.value();
			Object value = processValue( child, key, vc );
			setter( child, key, value );
		}

		if( savedClass != null )
		{
			currentClass = savedClass;
		}

		return child;
	}

	public Type inferClass( Object parent, String property )
	{
		String[] getters = likelyGetterNames( property );

		for( Method m : parent.getClass().getMethods() )
		{
			if( m.getGenericParameterTypes().length == 0 )
			{
				for( String name : getters )
				{
					if( m.getName().equals( name ))
					{
						ParameterizedType pt = (ParameterizedType) m.getGenericReturnType();
						Class<?> raw = (Class<?>) pt.getRawType();
						if( Map.class.isAssignableFrom( raw )) return pt;
						if( Collection.class.isAssignableFrom( raw )) return pt;
					}
				}
			}
		}

		String[] setters = likelySetterNames( property );

		for( Method m : parent.getClass().getMethods() )
		{
			if( m.getGenericParameterTypes().length == 1 )
			{
				for( String name : setters )
				{
					if( m.getName().equals( name ))
					{
						Class<?> duh = m.getParameterTypes()[0];
						if( duh != Object.class && !duh.isInterface() )
						{
							return duh;
						}


//						Type duh = m.getGenericParameterTypes()[0];
////						if( duh != Object.class && !duh.isInterface() )
//						{
//							return duh;
//						}

//						Type[] duh = m.getGenericParameterTypes();
//						ParameterizedType pt = (ParameterizedType) duh[0];
//						Class<?> actual = (Class<?>) pt.getRawType();
//						if( actual != Object.class && !actual.isInterface() )
//						{
//							return pt;
//						}
					}
				}
			}
		}

		return null;
	}

	public String[] likelyGetterNames( String property )
	{
		return new String[]
			{
				property,
				"get" + capitalize( property ),
				"get" + property.toUpperCase(),
				capitalize( property ),
				property.toUpperCase()
			};
	}

	public String[] likelySetterNames( String property )
	{
		return new String[]
		{
			"set" + capitalize( property ),
			"set" + property.toUpperCase(),
			property,
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
			Object value = processValue( found, key, vc );
			setter( found, key, value );
		}
	}
	
	public Object processValue( Object bean, String method, ValueContext vc )
		throws Exception
	{
		if( vc.map() != null )
		{
			return processMap( bean, method, vc.map() );
		}

		if( vc.scalar() != null )
		{
			return processScalar( vc.scalar() );
		}

		if( vc.list() != null )
		{
			return processList( bean, method, vc.list() );
		}
		return null;
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

		if( bean instanceof Collection )
		{
			Collection c = (Collection) bean;
			c.add( value );
			return;
		}

		Class type = null;
		if( value != null ) {
			type = value.getClass();
		}

		String[] setters = likelySetterNames( property );

		for( Method m : bean.getClass().getMethods() )
		{
			if( m.getGenericParameterTypes().length == 1 )
			{
				for( String name : setters )
				{
					if( m.getName().equals( name ))
					{
						Class<?> oof = m.getParameterTypes()[0];
						oof = toBoxingClass( oof );

						if( oof.isEnum() )
						{
							Class<? extends Enum> enumType = (Class<? extends Enum>) oof;
							final Enum<?> theOneAndOnly = Enum.valueOf(enumType, (String) value);
							Object ignored = m.invoke( bean, theOneAndOnly );
							return;
						}

						// Types are compatible OR we're just setting to null
						if( oof.isAssignableFrom( type ) || value == null )
						{
							Object result = m.invoke( bean, value );
							return;
						}

						break;
					}
				}
			}
		}

		throw new NoSuchMethodException( bean.getClass().getName() + "." + setters[0] + "(" + type.getName() + ")" );
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
	public Collection processList( Object bean, String property, ListContext lc )
		throws
		Exception
	{
		String alias = lc.alias() != null ? lc.alias().Word().getText() : null;

		Class<?> c = null;
		Class<?> savedClass = null;

		if( lc.className() != null )
		{
			String className = lc.className().getText();
			c = resolveClass( className );
		}
		else
		{
			Type t = inferClass( bean, property );
			if( t != null )
			{
				if( t instanceof ParameterizedType )
				{
					c = (Class<?>) ((ParameterizedType) t).getRawType();
					if( Map.class.isAssignableFrom( c ))
					{
						savedClass = (Class<?>) ((ParameterizedType) t).getActualTypeArguments()[1];
					}
					else if( Collection.class.isAssignableFrom( c ))
					{
						savedClass = (Class<?>) ((ParameterizedType) t).getActualTypeArguments()[0];
					}
				}
				else
				{
					c = (Class<?>) t;
				}
			}
			else
			{
				c = currentClass;
			}
		}

		Collection collection = (Collection) createChild( alias, c );

		if( savedClass != null )
		{
			Class<?> temp = savedClass;
			savedClass = currentClass;
			currentClass = temp;
		}


		for( TerminalNode tn : lc.Boolean() )
		{
			String text = tn.getText();
			Boolean value = java.lang.Boolean.parseBoolean( text );
			collection.add( value );
		}

		for( TerminalNode tn : lc.Integer() )
		{
			String text = tn.getText();
			Integer value = java.lang.Integer.parseInt( text );
			collection.add( value );
		}

		for( TerminalNode tn : lc.Float() )
		{
			String text = tn.getText();
			Float value = java.lang.Float.parseFloat( text );
			collection.add( value );
		}

		for( TerminalNode tn : lc.String() )
		{
			String value = tn.getText();
			value = value.substring( 1, value.length() - 1 );
			String y = unescape( value );
			collection.add( y );
		}

		for( TerminalNode tn : lc.Timestamp() )
		{
			String text = tn.getText();
			Date value =  parseDate( text );
			collection.add( value );
		}

		for( MapContext mc : lc.map() )
		{
			Object value = processMap( collection, "add", mc );
			collection.add( value );
		}

		if( savedClass != null )
		{
			currentClass = savedClass;
		}

		return collection;
	}
	
	public Class<?> resolveClass( String name )
		throws ClassNotFoundException
	{
		if( name == null ) return null;

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
