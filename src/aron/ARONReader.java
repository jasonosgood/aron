package aron;
/**
	ARON - A Righteous Object Notation
  
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.

	Appropriate open source license will go here.

	Created: 2002/06/08 Jason Osgood <mrosgood@yahoo.com>
	Rewritten: 2011/10/01 Jason Osgood <jason@jasonosgood.com> 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


// TODO: Report missing bean method

public class ARONReader
{
	private int _nestLevel = -1;
	public int getNestLevel() { return _nestLevel; }
	public void setNestLevel( int nestLevel ) { _nestLevel = nestLevel; }
	
	private ArrayList<String> _importDefs;
	private HashMap<String, Class<?>> _shortNames;
	private ArrayList<SimpleDateFormat> _formatters = new ArrayList<SimpleDateFormat>();

	public ARONReader()
	{
		this( 0 );
	}

	public ARONReader( int nestLevel )
	{
		setNestLevel( nestLevel );
		_importDefs = new ArrayList<String>( 4 );
		_shortNames = new HashMap<String, Class<?>>();
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssX", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm", Locale.ROOT ));
		_formatters.add( new SimpleDateFormat( "yyyy-MM-dd", Locale.ROOT ));
	}

	URI _uri = null;
	
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
//		InputStreamReader reader = new InputStreamReader( in );
		return read( in );
		
	}
	
	private LabelNode read( InputStream in )
		throws Exception
	{
		LabelNode labelRoot = new LabelNode( null, null );
		_labelStack.push( labelRoot );

		ParseTreeBuilder builder = new ParseTreeBuilder();
		CharStream cs = CharStreams.fromStream( in );
		ARONLexer lexer = new ARONLexer( cs );
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		ARONParser parser = new ARONParser( tokens );
		in.close();

		ARONParser.RootContext t = parser.root();

//		boolean displayTree = false;
//		if( displayTree )
//		{
//			System.out.println(t.toStringTree(parser));
////			System.out.println( builder.getTree().toParseTree() );
//		}
//
//		ParseNode parseRoot = builder.getTree();
//		ParseNode.addLexType( "Identifier", ARONLexer.Identifier );
//		ParseNode.addLexType( "Label", ARONLexer.Label );
//		ParseNode.addLexType( "Reference", ARONLexer.Reference );
//		process( parseRoot );
//
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
		List<ParseNode> includes = source.findNodes( "root/includes/url" );
		
		for( ParseNode include : includes )
		{
			String url = include.toInputString();
			includes( url );
		}

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
		
		List<ParseNode> overrides = source.findNodes( "root/override" );
		for( ParseNode override : overrides )
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
		
	public Object processChild( ParseNode node ) 
		throws 
			ARONException,
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
    		String method = prop.findFirstString( "Identifier" );
    		ParseNode value = prop.findFirstNode( "value" );
    		processValue( child, method, value );
    	}
    	
    	_labelStack.pop();
    	
    	return child;
	}
	
	public void override( ParseNode node ) 
		throws Exception
	{
		ParseNode pathNode = node.findFirstNode( "path" );
		
		for( Object object : pathNode.getChildren() )
		{
//			Token token = (Token) object;
//			String text = token.getText();
//			String label = text.substring( 1 );
//			LabelNode root = _labelStack.get( 0 );
//			Object found = root.find( label );
//			if( found == null )
//			{
//				String msg = String.format( "Reference to label '%s' not found (line: %d:%d)", label, token.getLine(), token.getCharPositionInLine() );
//				throw new IllegalArgumentException( msg );
//			}
//
//
//			ParseNode methodNode = node.findFirstNode( "method" );
//			String method = methodNode.toInputString();
//			method = method.substring( 1 );
//
//			ParseNode value = node.findFirstNode( "value" );
//    		processValue( found, method, value );
		}
	}
	
	public void processValue( Object bean, String method, ParseNode value ) 
		throws ARONException
//			ClassNotFoundException, InstantiationException, IllegalAccessException, 
//			IllegalArgumentException, NoSuchMethodException, InvocationTargetException
	{
		ParseNode temp = value.findFirstNode( "*" );
		
		try
		{
			switch( temp.getRule() )
			{
				case "scalar":
					Object scalar = processScalar( temp );
					setter( bean, method, scalar );
					break;
					
				case "child":
	    			try
	    			{
	        			Object grandchild = processChild( temp );
	    				setter( bean, method, grandchild );
	    			}
	    			catch( Exception ee )
	    			{
	    	        	String literal = temp.findFirstString( "Identifier" );
	    	        	if( !enumSetter( bean, method, literal ))
	    	        	{
	    	        		throw ee;
	    	        	}
	    			}
	    			break;
	    			
				case "list":
					processList( bean, method, temp );
	    			break;
	    			
				case "map":
					processMap( bean, method, temp );
					break;
					
				default:					
					// this probably can't ever happen
					throw new IllegalArgumentException( "unrecognized value subrule " + temp.getRule() );
			}
		}
		catch( Exception e )
		{
			throw new ARONException( value, e );
		}
	}

//	public void setter( Object bean, String property, Class<?> type, Object value ) 
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
		
	public Object processScalar( ParseNode value ) 
		throws IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException
	{
//		Token token = value.getToken( 0 );
//		String text = token.getText();
//		switch( token.getType() )
//		{
//			case ARONLexer.Boolean:
//			{
//    			Boolean x = Boolean.valueOf( text );
//    			return x;
//			}
//			case ARONLexer.String:
//			{
//				return text;
//			}
//			case ARONLexer.Float:
//			{
//				Float x = Float.valueOf( text );
//    			return x;
//			}
//			case ARONLexer.Integer:
//			{
//				Integer x = Integer.valueOf( text );
//    			return x;
//			}
//			case ARONLexer.Timestamp:
//			{
//				Date x = parseDate( text );
//    			return x;
//			}
//			case ARONLexer.Reference:
//			{
//				String label = text.substring( 1 );
//				LabelNode root = _labelStack.get( 0 );
//				Object found = root.find( label );
//				if( found == null )
//				{
//					throw new IllegalArgumentException( "Reference to label '" + text + "' not found" );
//				}
//				return found;
//			}
//			default:
				return null;
//		}
	}

	// TODO: initialize null list references
	public void processList( Object bean, String property, ParseNode node ) 
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
		
		ParseNode emptyList  = node.findFirstNode( "emptyList" );
		if( emptyList != null )
		{
			collection.clear();
			return;
		}
		
		ParseNode childList = node.findFirstNode( "childList" );
		if( childList != null )
		{
			List<ParseNode> children = childList.findNodes( "child" );
			for( ParseNode child : children )
			{
				Object ugh = processChild( child );
				collection.add( ugh );
			}
			return;
		}

		
		ParseNode first  = node.findFirstNode( "*" );
		for( Object child : first.getChildren() )
		{
//			Object value = null;
//
//			Token token = (Token) child;
//			String text = token.getText();
//			switch( token.getType() )
//			{
//				case ARONLexer.Integer:
//					value = Integer.parseInt( text );
//					break;
//
//				case ARONLexer.Float:
//					value = Float.parseFloat( text );
//					break;
//
//				case ARONLexer.Timestamp:
//					value = parseDate( text );
//					break;
//
//				case ARONLexer.Boolean:
//					value = Boolean.parseBoolean( text );
//					break;
//
//				case ARONLexer.String:
//					value = text;
//					break;
//
//				// Don't convert, add whitespace, comments, etc
//				default:
//					continue;
//
//			}
//
//			collection.add( value );
		}
	}
	
	public void processMap( Object instance, String bean, ParseNode assoc )
		throws 
			ARONException,
			IllegalArgumentException, NoSuchMethodException, IllegalAccessException, 
			InvocationTargetException, ClassNotFoundException, InstantiationException
	{
		Object map = getter( instance, bean );
		if( !( map instanceof Map ))
		{
			String msg = instance.getClass().getName() + ".get" + bean + "() does not return a java.util.Map";
			throw new IllegalArgumentException( msg );
		}
			
		List<ParseNode> pairs = assoc.findNodes( "pair" );
		for( ParseNode pair : pairs )
		{
			ParseNode key = pair.findFirstNode( "key" );
			String text = key.getToken( 0 ).getText();
			ParseNode value = pair.findFirstNode( "value" );
			processValue( map, text, value );
		}	
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
