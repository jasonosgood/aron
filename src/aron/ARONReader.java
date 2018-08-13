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
import java.util.Locale;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import static aron.ARONParser.*;

// TODO: Report missing bean method

public class ARONReader
{
	// Increment for each 'include'
	private int _nestLevel = -1;
	public int getNestLevel() { return _nestLevel; }
	public void setNestLevel( int nestLevel ) { _nestLevel = nestLevel; }
	
	private ArrayList<String> _importDefs;
	private HashMap<String, Class<?>> _shortNames;
	private ArrayList<SimpleDateFormat> _formatters = new ArrayList();

	public ARONReader()
	{
		this( 0 );
	}

	public ARONReader( int nestLevel )
	{
		setNestLevel( nestLevel );
		_importDefs = new ArrayList( 4 );
		_shortNames = new HashMap();
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssX", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd", Locale.ROOT ));
	}

	private URI _uri = null;
	
	public LabelNode read( File file )
		throws Exception
	{
		URI uri = file.toURI();
		return read( uri );
	}
 
	public LabelNode read( URL url )
		throws Exception
	{
		URI uri = url.toURI();
		return read( uri );
	}
	
	public LabelNode read( URI uri )
		throws Exception
	{
		int level = getNestLevel();
		if( level > 0 )
		{
			while( level > 0 )
			{
				System.out.print( "  " );
				level--;
			}
			System.out.print( "including " );
		}
		else
		{
			System.out.print( "reading " );
		}
		System.out.println( uri );

		_uri = uri;
		InputStream in = uri.toURL().openStream();
		return read( in );
	}

	public LabelNode read( InputStream in )
		throws Exception
	{
		CharStream cs = CharStreams.fromStream( in );
		LabelNode root = read( cs );
		return root;
	}

	public static LabelNode read( String str )
		throws Exception
	{
		CharStream cs = CharStreams.fromString( str );
		LabelNode root = new ARONReader().read( cs );
		return root;
	}

	private LabelNode read( CharStream cs )
		throws Exception
	{
		LabelNode labelRoot = new LabelNode( null, null );
		_labelStack.push( labelRoot );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens );

		RootContext t = parser.root();
		process( t );

		return _labelStack.get( 0 );
	}

	private int _anon = 0;

	private Stack<LabelNode> _labelStack = new Stack();
	
	public void register( String label, Object instance )
	{
		if( label == null )
		{
			label = "unlabeled" + _anon++;
		}

		LabelNode child = new LabelNode( label, instance );
		LabelNode parent = _labelStack.peek();
		parent.addChild( child );
		_labelStack.push( child );
	}

	public void process( RootContext rc )
		throws Exception
	{
		for( IncludesContext include : rc.includes() )
		{
			String url = include.Url().getText();
			System.out.println( "include: " + url );
            includes( url );
		}

		for( ImportsContext imports : rc.imports() )
		{
			ComboContext id = imports.combo();
			String name = id.getText();
			imports( name );
		}

		for( ChildContext child : rc.child() )
		{
			processChild( child );
		}
		
		for( OverrideContext override : rc.override() )
		{
			override( override );
		}
	}

	public void includes( String url )
		throws Exception
	{
		Path parent = Paths.get( _uri );
		Path sibling = parent.resolveSibling( url );
		File file = sibling.toFile();	
		if( file.exists() )
		{
			int nestLevel = getNestLevel() + 1;
			ARONReader aron = new ARONReader( nestLevel );
			LabelNode childRoot = aron.read( file );
			LabelNode root = _labelStack.get( 0 );
			root.getChildren().addAll( childRoot.getChildren() );
		}
		else
		{
			throw new FileNotFoundException( file.toString() );
		}
	}

	public void imports( String clazzName )
		throws ClassNotFoundException
	{
		Class<?> clazz = Class.forName( clazzName );
		int nth = clazz.toString().lastIndexOf( (int) '.' );
		String shortie = clazz.toString().substring( nth + 1 );
		_shortNames.put( shortie, clazz );
	}

	public Object processChild( ChildContext context )
		throws 
			ARONException,
			ClassNotFoundException, InstantiationException, IllegalAccessException, 
			IllegalArgumentException, NoSuchMethodException, InvocationTargetException
	{
		String name = context.combo().getText();
		String label = context.label() != null ? context.label().Word().getText() : null;

		Class<?> clazz = resolveClass( name );

		// TODO: Need to first verify a zero param constructor exists
		Constructor<?> constructor = clazz.getConstructor();
		Object child = constructor.newInstance();

		register( label, child );

		for( PropertyContext prop : context.property() )
		{
			String method = prop.combo().getText();
			ValueContext value = prop.value();
			processValue( child, method, value );
		}

		_labelStack.pop();

		return child;
	}
	
	public void override( OverrideContext context )
		throws Exception
	{
		String label = context.reference().Word().getText();
		String method = context.method().Word().getText();
		ValueContext vc = context.value();

		LabelNode root = _labelStack.get( 0 );
		Object found = root.find( label );

		processValue( found, method, vc );
	}
	
	public void processValue( Object bean, String method, ValueContext value )
		throws ARONException
	{
		try
		{
			ParserRuleContext child = (ParserRuleContext) value.getChild( 0 );
			switch( child.getRuleIndex() )
			{
				case RULE_scalar:
					Object scalar = processScalar( (ScalarContext) child );
					setter( bean, method, scalar );
					break;

				case RULE_child:
	    			try
	    			{
	        			Object grandchild = processChild( (ChildContext) child );
	    				setter( bean, method, grandchild );
	    			}
	    			catch( Exception ee )
	    			{
	    				// Not a child, might be an enum
						String literal = ( (ChildContext) child ).combo().getText();
	    	        	if( !enumSetter( bean, method, literal ))
	    	        	{
	    	        		throw ee;
	    	        	}
	    			}
	    			break;

				case RULE_list:
					processList( bean, method, (ListContext) child );
	    			break;

				case RULE_map:
					processMap( bean, method, (MapContext) child );
					break;

				default:
					// this probably can't ever happen
					throw new IllegalArgumentException( "unrecognized value subrule " + child.toStringTree() );
			}
		}
		catch( Exception e )
		{
			throw new ARONException( value, e );
		}
	}

	public void setter( Object bean, String property,  Object value )
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

		String[] names = new String[]
		{
			"set" + capitalize( property ),
			"set" + property.toUpperCase()
		};

		for( Method method : bean.getClass().getMethods() )
		{
			for( String name : names )
			{
				if( method.getName().equals( name ))
				{
					for( Class<?> oof : method.getParameterTypes() )
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

	public boolean enumSetter( Object instance, String bean, String literal ) 
		throws 
			EnumConstantNotPresentException, IllegalArgumentException, 
			IllegalAccessException, InvocationTargetException
	{
		String name = "set" + capitalize( bean );
		
		for( Method method : instance.getClass().getMethods() )
		{
			if( method.getName().equals( name ))
			{
				for( Class<?> paramType : method.getParameterTypes() )
				{
					if( paramType.isEnum() )
					{
						Class<? extends Enum> enumType = (Class<? extends Enum>) paramType;
						
						Object value = null;
						try
						{
							value = Enum.valueOf( enumType, literal );
						}
						catch( IllegalArgumentException e )
						{
							throw new EnumConstantNotPresentException( enumType, literal );
						}
						Object ignored = method.invoke( instance, value );
						return true;
					}
					break;
				}
			}
		}
		
		return false;
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
			return x;
		}

		if( value.Timestamp() != null )
		{
			String text = value.Timestamp().getText();
			Date x = parseDate( text );
			return x;
		}

		if( value.reference() != null )
		{
			String label = value.reference().Word().getText();
			LabelNode root = _labelStack.get( 0 );
			Object found = root.find( label );
			if( found == null )
			{
				throw new IllegalArgumentException( "Reference to label '" + label + "' not found" );
			}
			return found;
		}

		return null;
	}

	// TODO: initialize null list references
	public void processList( Object bean, String property, ListContext node )
		throws 
			ARONException,
			NoSuchMethodException, IllegalArgumentException, IllegalAccessException, 
			InvocationTargetException, ClassNotFoundException, InstantiationException
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

		if( node.Boolean() != null )
		{
			for( TerminalNode tn : node.Boolean() )
			{
				String text = tn.getText();
				Boolean value = java.lang.Boolean.parseBoolean( text );
				collection.add( value );
			}
			return;
		}

		if( node.Integer() != null )
		{
			for( TerminalNode tn : node.Integer() )
			{
				String text = tn.getText();
				Integer value = java.lang.Integer.parseInt( text );
				collection.add( value );
			}
			return;
		}

		if( node.Float() != null )
		{
			for( TerminalNode tn : node.Float() )
			{
				String text = tn.getText();
				Float value = java.lang.Float.parseFloat( text );
				collection.add( value );
			}
			return;
		}

		if( node.String() != null )
		{
			for( TerminalNode tn : node.String() )
			{
				String value = tn.getText();
				collection.add( value );
			}
			return;
		}

		if( node.Timestamp() != null )
		{
			for( TerminalNode tn : node.Timestamp() )
			{
				String text = tn.getText();
				Date value =  parseDate( text );
				collection.add( value );
			}
			return;
		}

		if( node.child() != null )
		{
			for( ChildContext kid : node.child() )
			{
				Object ugh = processChild( kid );
				collection.add( ugh );
			}
			return;
		}

		// empty list clears existing collection
		collection.clear();
		return;
	}
	
	public void processMap( Object instance, String bean, MapContext assoc )
		throws 
			ARONException,
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, 
			InvocationTargetException
	{
		Object map = getter( instance, bean );
		if( !( map instanceof Map ))
		{
			String msg = instance.getClass().getName() + ".get" + bean + "() does not return a java.util.Map";
			throw new IllegalArgumentException( msg );
		}

		for( PairContext p : assoc.pair() )
		{
			String text = p.key().getText();
			processValue( map, text, p.value() );
		}
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
    
    public String toString()
    {
    	return _uri == null ? "<inputstream>" : _uri.toString();
    }
}
