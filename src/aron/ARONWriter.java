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
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.lang.Number;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// TODO: empty lists must write brackets, eg "property []" 

public class 
	ARONWriter 
{
	private Writer _writer = null;
	
	public ARONWriter( Writer writer )
	{
		if( writer == null )
		{
			throw new NullPointerException( "writer" );
		}
		_writer = writer;  
	}

	public ARONWriter( OutputStream out )
	{
		if( out == null )
		{
			throw new NullPointerException( "out" );
		}
		_writer = new OutputStreamWriter( out );
	}
	
	private Stack<Object> _objectStack = new Stack<Object>();

	public void write( Object value )
		throws IOException, IllegalAccessException
	{
		if( value == null )
		{
			throw new NullPointerException( "value" );
		}
		
		_writer.write( "# ARON 0.2" );
		Set<Class> imports = getClassesUsed( value );
		if( imports.size() > 0 )
		{
			newline( 0 );
			for( Class klass : imports )
			{
				// TODO: This may not be right / ideal. eg when an enum has instance variables, ARONReader may need import
				if( !klass.isEnum() )
				{
					newline( 0 );
					_writer.write( "import " );
					_writer.write( klass.getName() );
				}
			}
			newline( 0 );
		}

		newline( 0 );
		write( value, 0 );
		newline( 0 );
		_writer.flush();
	}

	public Set<Class> getClassesUsed( Object obj )
		throws IllegalAccessException
	{
		HashSet<Class> list = new HashSet<Class>();
		listClasses( obj, list );
		return list;
	}
	
	Stack<Class> _classStack = new Stack<Class>();
	public void listClasses( Object obj, Set<Class> list )
		throws IllegalAccessException
	{
		if( obj == null ) return;
		
		Class<? extends Object> type = obj.getClass();
		
		// Skip ARON's native support for Java types
		if( type.isPrimitive() || Number.class.isAssignableFrom( type )) return;
		if( type == Boolean.class ) return;
		if( type == String.class ) return;
		if( type == Character.class ) return;
		if( type == Date.class ) return;
		if( Enum.class.isAssignableFrom( type )) return;
		if( _classStack.contains( type )) return;
		_classStack.push( type );
		
		// Primitive array (vs ArrayList)
		if( type.isArray() )
		{
			int len = java.lang.reflect.Array.getLength( obj );
			for( int nth = 0; nth < len; nth++ )
			{
				Object item = java.lang.reflect.Array.get( obj, nth );
				listClasses( item, list );
			}
			return;
		}
		
		if( Collection.class.isAssignableFrom( type ) )
		{
			Collection<?> c = (Collection<?>) obj;
			if( c.size() >  0 )
			{
				for( Object item : c )
				{
					listClasses( item, list );
				}
			}
		}
		
		if( Map.class.isAssignableFrom( type ) )
		{
			// TODO: Support non-String values?
			for( Map.Entry entry : ((Map<?, ?>) obj).entrySet()) 
			{
				Object key = entry.getKey();
				if( key == null ) continue;
				listClasses( entry.getValue(), list );
			}
		}

		// Exclude instances of java.util.*
		if( !type.getName().startsWith( "java.util." ))
		{
			list.add( type );
			
			List<Field> fields = getFields( type );
			for( Field field : fields )
			{
				Object spork = field.get( obj );
				if( spork != null )
				{
					listClasses( spork, list );
				}
			}
		}
		
		_classStack.pop();
	}

	SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ" );
	
	protected void write( Object obj, int tabs ) 
		throws IOException
	{
		if( obj == null ) 
		{
			_writer.write( "null" );
			return;
		}
		
		if( _objectStack.contains( obj )) 
		{
			_writer.write( "null" );
			return;
		}
		
		_objectStack.push( obj );

		Class<?> type = obj.getClass();
		
		if( type.isArray() )
		{
			newline( tabs );
			_writer.write( '[' );
			tabs++;
			int len = java.lang.reflect.Array.getLength( obj );
			for( int nth = 0; nth < len; nth++ )
			{
				Object item = java.lang.reflect.Array.get( obj, nth );
				newline( tabs );
				write( item, tabs );
			}
			tabs--;
			_writer.write( ']' );
		}
		else if( Collection.class.isAssignableFrom( type ) )
		{
			Collection<?> c = (Collection<?>) obj;
			newline( tabs );
			_writer.write( '[' );
			if( c.size() >  0 )
			{
				tabs++;
				for( Object item : c )
				{
					newline( tabs );
					write( item, tabs );
				}
				tabs--;
			}
			newline( tabs );
			_writer.write( ']' );
		}
		else if( Map.class.isAssignableFrom( type ) )
		{
			newline( tabs );
			_writer.write( '{' );
			tabs++;
			// TODO: Support non-String values?
			for( Map.Entry entry : ((Map<?, ?>) obj).entrySet()) 
			{
				Object key = entry.getKey();
				if( key == null ) continue;
				newline( tabs );
				_writer.write( key.toString() );
				_writer.write( ' ' );
				write( entry.getValue(), tabs );
			}
			tabs--;
			newline( tabs );
			_writer.write( '}' );
		}
		else if( type.isPrimitive() || Number.class.isAssignableFrom( type ))
		{
			_writer.write( obj.toString() );
		}
		else if( type == Boolean.class )
		{
			_writer.write( obj.toString() );
		}
		else if( type == String.class )
		{
			_writer.write( '"' );
			String text = obj.toString();
			int bork = text.length();
			for( int nth = 0; nth < bork; nth++ )
			{
				char c = text.charAt( nth );
				escape( c );
			}
			_writer.write( '"' );
		}
		else if( type == Character.class )
		{
			_writer.write( '\'' );
			char c = ((Character) obj).charValue();
			escape( c );
			_writer.write( '\'' );
		}
		else if( type == Date.class )
		{
			// TODO: Format
			_writer.write( sdf.format( (Date) obj ) );
		}
		else if( Enum.class.isAssignableFrom( type ))
		{
			_writer.write( obj.toString() );
		}
		else
		{
			_writer.write( type.getSimpleName() );
			List<Field> fields = getFields( type );
			try
			{
				Constructor<?> c = type.getDeclaredConstructor();
				c.setAccessible( true );
				Object vanilla = c.newInstance();

				newline( tabs );
				_writer.write( '(' );
				tabs++;
				for( Field field : fields )
				{
					Object spork = field.get( obj );
					Object dung = field.get( vanilla );
					boolean dirty = !equals( spork, dung );
					if( dirty )
					{
						newline( tabs );
						_writer.write( field.getName() );
						_writer.write( ' ' );
						write( spork, tabs );
					}
				}
				tabs--;

				newline( tabs );
				_writer.write( ')' );
			}
			catch( Exception e )
			{
			}
		}
		
		_objectStack.pop();
	}
	
	public static boolean equals( Object x, Object y ) 
	{
		return x == null ? y == null : x.equals( y );
	}

	private List<Field> getFields( Class<?> type ) 
	{
		ArrayList<Field> fields = new ArrayList<Field>();
		
		while( type != Object.class )
		{
			for( Field field : type.getDeclaredFields() ) 
			{
				int modifiers = field.getModifiers();
				if( Modifier.isTransient( modifiers ) ) continue;
				if( Modifier.isStatic( modifiers ) ) continue;
				if( field.isSynthetic() ) continue;
				
				if( !field.isAccessible() ) 
				{
					try 
					{
						field.setAccessible( true );
					} 
					catch( AccessControlException ex )
					{
						continue;
					}
				}
				fields.add( field );
			}
			
			type = type.getSuperclass();
		}
		return fields;
	}

	public void escape( char c ) 
		throws IOException 
	{
		switch( c )
		{
			case '"': 
				_writer.write( '\\' );
				_writer.write( c );
				break;
			case '\n': 
				_writer.write( '\\' );
				_writer.write( 'n' );
				break;
			case '\r': 
				_writer.write( '\\' );
				_writer.write( 'r' );
				break;
			case '\t': 
				_writer.write( '\\' );
				_writer.write( 't' );
				break;
			default: 
				_writer.write( c );
		}
	}
	
	public void newline( int tabs )
		throws IOException
	{
		_writer.write( '\n' );
		for( int nth = 0; nth < tabs; nth++ )
		{
			_writer.write( '\t' );
		}
	}
	
	public static String toString( Object o )
	{
		try 
		{
			StringWriter sw = new StringWriter();
			ARONWriter writer = new ARONWriter( sw );
			writer.write( o );
			return sw.toString();
		} 
		catch( IOException e ) 
		{
			e.printStackTrace();
			return "error";
		}
		catch( IllegalAccessException e )
		{
			e.printStackTrace();
			return "error";
		}
	}
}
