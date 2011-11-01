package aron;
/**
	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 
 */

import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

// TODO: Report missing bean method

public class ARON
{
	public static final void main( String[] args )
		throws Exception
	{
		ARON aron = new ARON();
		FileReader reader = new FileReader( "./test/cronk/test1.aron" );
 
		ParseTreeBuilder builder = new ParseTreeBuilder();
		CharStream cs = new ANTLRReaderStream( reader );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens, builder );

		parser.root();
		reader.close();

		boolean displayTree = true;
		if( displayTree )
		{
			System.out.println( builder.getTree().toParseTree() );
//			System.out.println( "string tree: " + builder.getTree().toStringTree() );
		}
		
		ParseNode source = builder.getTree();
		ParseNode.addLexType( "Identifier", ARONLexer.Identifier );
		ParseNode.addLexType( "Label", ARONLexer.Label );
		aron.load( source );
		Object parent = aron._registry.get( "parent" );
		System.out.println( "done" );
	}
	
	public int _anon = 0;
	HashMap<String,Object> _registry = new HashMap<String,Object>();
	public void register( String label, Object instance )
	{
		if( label == null )
		{
			label = "anon" + _anon++;
			_registry.put( label, instance );
		}
		else
    	{
    		label = label.toLowerCase();
    		label = label.substring( 0, label.length() - 1 );
			if( _registry.containsKey( label ))
			{
				System.err.println( "Redefinition of label " + label + " not allowed." );
			}
			else
			{
				_registry.put( label, instance );
			}
    	}
	}
	
	public void load( ParseNode source )
		throws Exception
	{
		
		List<ParseNode> klasses = source.findNodes( "root/imports/klass" );
		for( ParseNode klass : klasses )
		{
			String name = klass.toInputString();
			imports( name );
		}

		List<ParseNode> children = source.findNodes( "root/child" );
		for( ParseNode child : children )
		{
			processChild( child );
		}
	}
	
	public Object processChild( ParseNode child )
	{
    	Object instance = null;
		String name = child.findFirstString( "Identifier" );
		String label = child.findFirstString( "Label" );
			
        try
        {
        	Class<?> clazz = resolveClass( name );
        	
        	// TODO: Need check to ensure a zero param constructor exists
        	instance = clazz.newInstance();
        	register( label, instance );
        	
        	
        	List<ParseNode> propertyList = child.findNodes( "property" );
        	for( ParseNode prop : propertyList )
        	{
        		String bean = prop.findFirstString( "Identifier" );
        		System.out.println( "\t" + bean );
        		try
        		{
	        		ParseNode value = prop.findFirstNode( "value" );
	        		if( value != null )
	        		{
	        			processValue( instance, bean, value );
	        		}
	            		
	        		ParseNode kid = prop.findFirstNode( "child" );
	        		if( kid != null )
	        		{
	        			Object ugh = processChild( kid );
	        			setter( instance, bean, ugh.getClass(), ugh );
	    				continue;
	        		}
	        		
	        		ParseNode list = prop.findFirstNode( "list" );
	        		if( list != null )
	        		{
	        			processList( instance, bean, list );
	        			continue;
	        		}
	        		
	        		ParseNode assoc = prop.findFirstNode( "assoc" );
	        		if( assoc != null )
					{
	        			processAssoc( instance, bean, assoc );
	    				continue;
					}
        		}
	        	catch( NoSuchMethodException e )
	        	{
	        		e.printStackTrace();
	        	}
        		catch( InvocationTargetException e )
        		{
	        		e.printStackTrace();
        			
        		}
        	}
        	
        }
        catch( IllegalAccessException e ) 
        {
    		e.printStackTrace();

        }
        catch( ClassNotFoundException e )
        {
    		e.printStackTrace();
        	
        }
        catch( InstantiationException e ) 
        {
    		e.printStackTrace();
        	
        }
        return instance;
	}

	public void setter( Object instance, String bean, Class<?> type, Object value ) 
		throws NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		String name = "set" + capitalize( bean );
		Class<?> clazz = instance.getClass();
		Method setter = clazz.getMethod( name, type );
		Object result = setter.invoke( instance, new Object[] { value } );
	}
	
	public void processValue( Object instance, String bean, ParseNode value ) 
		throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException
	{
		Token token = value.getToken( 0 );
		String text = token.getText();
		switch( token.getType() )
		{
			case ARONLexer.Bool:
			{
    			Boolean x = Boolean.valueOf( text );
    			setter( instance, bean, boolean.class, x );
				break;
			}	
			case ARONLexer.String:
			{
				text = text.substring( 1, text.length() - 1 );
    			setter( instance, bean, String.class, text );
				break;
			}	
			case ARONLexer.Float:
			{
				Float x = Float.valueOf( text );
				setter( instance, bean, float.class, x );
				break;
			}	
			case ARONLexer.Integer:
			{
				Integer x = Integer.valueOf( text );
				setter( instance, bean, int.class, x );
				break;
			}	
			case ARONLexer.Timestamp:
			{
				SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT );
				try 
				{
					Date x = formatter.parse( text );
					setter( instance, bean, Date.class, x );
				} 
				catch( ParseException e ) 
				{
					e.printStackTrace();
				}
				break;
			}
			case ARONLexer.Reference:
			{
				break;
			}
			default:
				break;
		}
	}

	public void processList( Object instance, String bean, ParseNode node )
		throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException
	{
		String capitalized = capitalize( bean );
		Method getter = instance.getClass().getMethod( "get" + capitalized );
		Object list = getter.invoke( instance );
		Method adder = list.getClass().getMethod( "add", Object.class );
		List<ParseNode> children = node.findNodes( "childList/child" );
		for( ParseNode child : children )
		{
			Object ugh = processChild( child );
			Object result = adder.invoke( list, new Object[] { ugh } );
		}
	}
	
	public void processAssoc( Object instance, String bean, ParseNode assoc )
		throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException
	{
		String capitalized = capitalize( bean );
		Method getter = instance.getClass().getMethod( "get" + capitalized );
		Object map = getter.invoke( instance );
		Method putter = map.getClass().getMethod( "put", new Class[] { Object.class, Object.class } );
		List<ParseNode> entries = assoc.findNodes( "property" );
		for( ParseNode entry : entries )
		{
			String key = entry.findFirstString( "Identity" );
			ParseNode child = entry.findFirstNode( "child" );
			Object value = processChild( child );
			Object result = putter.invoke( map, new Object[] { key, value } );
		}	
	}
	
	private ArrayList<String> importDefs;
	private HashMap<String, Class<?>> shortNames;

	public ARON()
	{
		importDefs = new ArrayList<String>( 4 );
		shortNames = new HashMap<String, Class<?>>();
		_registry = new HashMap<String, Object>();
	}

	public void imports( String clazzName )
		throws ClassNotFoundException
	{
		Class<?> clazz = Class.forName( clazzName );
		int nth = clazz.toString().lastIndexOf( (int) '.' );
		String shortie = clazz.toString().substring( nth + 1 );
		shortNames.put( shortie, clazz );
	}
	
	public Class<?> resolveClass( String name )
		throws ClassNotFoundException
	{
		Class<?> result = null;
		
		// First see if we can get a hit on the short name
		Object hit = shortNames.get( name );
		if( hit != null )
		{
			result = (Class<?>) hit;
		}

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
			Iterator<String> i = importDefs.iterator();

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
					shortNames.put( shortie, result );

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
}
