package aron;
/**
	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 2002/06/08 Jason Osgood <mrosgood@yahoo.com>
	Rewritten: 2011/10/01 Jason Osgood <jason@jasonosgood.com> 
 */

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import java.util.Stack;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;

// TODO: Report missing bean method

public class ARONReader
{
	public LabelNode read( File file )
		throws Exception
	{
		FileReader reader = new FileReader( file );
		return read( reader );
	}
 
	public LabelNode read( InputStream in )
		throws Exception
	{
		InputStreamReader reader = new InputStreamReader( in );
		return read( reader );
	}
	
	public LabelNode read( Reader reader )
		throws Exception
	{
		LabelNode labelRoot = new LabelNode( null, null );
		_labelStack.push( labelRoot );

		ParseTreeBuilder builder = new ParseTreeBuilder();
		CharStream cs = new ANTLRReaderStream( reader );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens, builder );

		parser.root();
		reader.close();

		boolean displayTree = false;
		if( displayTree )
		{
			System.out.println( builder.getTree().toParseTree() );
		}
		
		ParseNode parseRoot = builder.getTree();
		ParseNode.addLexType( "Identifier", ARONLexer.Identifier );
		ParseNode.addLexType( "Label", ARONLexer.Label );
		ParseNode.addLexType( "Reference", ARONLexer.Reference );
		process( parseRoot );
		return _labelStack.get( 0 );
	}
	
	public int _anon = 0;

	private Stack<LabelNode> _labelStack = new Stack<LabelNode>();
	
	public void register( String label, Object instance )
	{
		if( label == null )
		{
			label = "unlabeled" + _anon++;
		}
		
		label = label.substring( 0, label.length() - 1 );
		LabelNode child = new LabelNode( label, instance );
		LabelNode parent = _labelStack.peek();
		parent.addChild( child );
		_labelStack.push( child );
	}
	
	public void process( ParseNode source )
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
	
	public Object processChild( ParseNode node ) 
		throws 
			ClassNotFoundException, InstantiationException, IllegalAccessException, 
			IllegalArgumentException, NoSuchMethodException, InvocationTargetException
	{
    	String name = node.findFirstString( "Identifier" );
    	Class<?> clazz = resolveClass( name );
    	
    	// TODO: Need to first verify a zero param constructor exists
    	Object child = clazz.newInstance();
    	
    	String label = node.findFirstString( "Label" );
    	register( label, child );
    	
    	List<ParseNode> propertyList = node.findNodes( "property" );
    	for( ParseNode prop : propertyList )
    	{
    		String bean = prop.findFirstString( "Identifier" );

			ParseNode value = prop.findFirstNode( "value" );
    		if( value != null )
    		{
    			processValue( child, bean, value );
    			continue;
    		}
        		
    		ParseNode kid = prop.findFirstNode( "child" );
    		if( kid != null )
    		{
    			try
    			{
        			Object grandchild = processChild( kid );
    				setter( child, bean, grandchild.getClass(), grandchild );
    			}
    			catch( Exception ee )
    			{
    	        	String literal = kid.findFirstString( "Identifier" );
    	        	if( !enumSetter( child, bean, literal ))
    	        	{
    	        		throw ee;
    	        	}
    			}
    			continue;
    		}
	        		
    		ParseNode list = prop.findFirstNode( "list" );
    		if( list != null )
    		{
    			processList( child, bean, list );
    			continue;
    		}
    		
    		ParseNode assoc = prop.findFirstNode( "assoc" );
    		if( assoc != null )
			{
    			processAssoc( child, bean, assoc );
				continue;
			}
		}
    	
    	return child;
	}

	public void setter( Object instance, String bean, Class<?> type, Object value ) 
		throws 
			NoSuchMethodException, IllegalArgumentException, 
			IllegalAccessException, InvocationTargetException
	{
		String name = "set" + capitalize( bean );
		
		for( Method method : instance.getClass().getMethods() )
		{
			if( method.getName().equals( name ))
			{
				for( Class<?> oof : method.getParameterTypes() )
				{
					if( oof.isAssignableFrom( type ) )
					{
						Object result = method.invoke( instance, value );
						return;
					}
					break;
				}
			}
		}
			
		throw new NoSuchMethodException( instance.getClass().getName() + "." + name + "(" + type.getName() + ")" );
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
						Object result = method.invoke( instance, value );
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
//				text = text.substring( 1, text.length() - 1 );
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
				SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT );
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
				String label = text.substring( 1 );
				LabelNode root = _labelStack.get( 0 );
				Object found = root.find( label );
				if( found == null )
				{
					throw new IllegalArgumentException( "Reference to label '" + text + "' not found" );
				}
				setter( instance, bean, found.getClass(), found );
				break;
			}
			default:
				break;
		}
	}

	public void processList( Object instance, String bean, ParseNode node )
		throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, InstantiationException
	{
		Object list = getter( instance, bean );
		if( list == null )
		{
			throw new NullPointerException( instance.getClass().getName() + ".get" + capitalize( bean ) + "() returned null" );
		}
		if( list instanceof Collection )
		{
			for( Method method : list.getClass().getMethods() )
			{
				if( method.getName().equals( "add" ))
				{
					for( Class<?> oof : method.getParameterTypes() )
					{
						if( oof.isAssignableFrom( Object.class ) )
						{
							List<ParseNode> children = node.findNodes( "childList/child" );
							for( ParseNode child : children )
							{
								Object ugh = processChild( child );
								Object result = method.invoke( list, ugh );
							}
							return;
						}
						break;
					}
				}
			}
			
			throw new NoSuchMethodException( instance.getClass().getName() + ".add(java.lang.Object)" );
		}
		else
		{
			String msg = instance.getClass().getName() + ".get" + capitalize( bean ) + "() does not return a java.util.Collection";
			throw new IllegalArgumentException( msg );
		}
	}
	
	public void processAssoc( Object instance, String bean, ParseNode assoc )
		throws 
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, 
			InvocationTargetException, ClassNotFoundException, InstantiationException
	{
		Object map = getter( instance, bean );
		if( map instanceof Map )
		{
			for( Method method : map.getClass().getMethods() )
			{
				if( method.getName().equals( "put" ))
				{
					Class<?>[] types = method.getParameterTypes();
					if( 
						types.length == 2 
						&& types[0].isAssignableFrom( Object.class )
						&& types[1].isAssignableFrom( Object.class )
					)
					{
						List<ParseNode> entries = assoc.findNodes( "property" );
						for( ParseNode entry : entries )
						{
							String key = entry.findFirstString( "Identifier" );
							ParseNode child = entry.findFirstNode( "child" );
							Object value = processChild( child );
							Object result = method.invoke( map, key, value );
						}	
						return;
					}
				}
			}
			throw new NoSuchMethodException( instance.getClass().getName() + ".put(java.lang.Object,java.lang.Object)" );
		}
		else
		{
			String msg = instance.getClass().getName() + ".get" + bean + "() does not return a java.util.Map";
			throw new IllegalArgumentException( msg );
		}
	}
	
	private ArrayList<String> _importDefs;
	private HashMap<String, Class<?>> _shortNames;

	public ARONReader()
	{
		_importDefs = new ArrayList<String>( 4 );
		_shortNames = new HashMap<String, Class<?>>();
	}

	public void imports( String clazzName )
		throws ClassNotFoundException
	{
		Class<?> clazz = Class.forName( clazzName );
		int nth = clazz.toString().lastIndexOf( (int) '.' );
		String shortie = clazz.toString().substring( nth + 1 );
		_shortNames.put( shortie, clazz );
	}
	
	public Class<?> resolveClass( String name )
		throws ClassNotFoundException
	{
		Class<?> result = null;
		
		// First see if we can get a hit on the short name
		Object hit = _shortNames.get( name );
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
}
