package aron.write;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.lang.Number;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import aron.ARON;

import cronk.Cronk;
import cronk.Season;

public class 
	ARONWriter 
{
	public static void main( String[] args ) 
		throws Exception
	{
		OutputStreamWriter ugh = new OutputStreamWriter(System.out);
		ARONWriter w = new ARONWriter( ugh);
		w.write( Season.autumn );
		
		
		String filename = "./test/cronk/test1.aron";
		File file = new File( filename );
		ARON aron = new ARON();
		
		aron.load( file );
		Object derp = aron.getRegistry().get( "parent" );
		
//		w.write( null );
//		w.write( 123 );
//		w.write( "a\"b\n\r\tc" );
//		int[] a = { 1, 2, 99 };
//		w.write( a );
//		w.write( true );
//		w.write( false );
//		w.write( 'c' );
//		
//		ArrayList<String> l = new ArrayList<String>();
//		l.add( "x" );
//		l.add( "y" );
//		l.add( "z" );
//		w.write( l );
//		
//		HashMap m = new HashMap();
//		m.put( "a", "apple" );
//		m.put( "b", "banana" );
//		m.put( "c", "cherry" );
//		w.write( m );
		
//		w.write( new Date() );
		
//		Cronk cronk = new Cronk();
		w.write( derp );
		ugh.close();
	}

	Writer _writer = null;
	
	public ARONWriter( Writer writer )
	{
		_writer = writer;  
	}

	public void write( Object value ) 
		throws IOException
	{
		write( value, 0 );
	}
	
	public void tabs( int i )
		throws IOException
	{
		for( int nth = 0; nth < i; nth++ )
		{
			_writer.write( '\t' );
		}
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ssZ" );
	public void write( Object obj, int tabs ) 
		throws IOException
	{
		if( obj == null ) 
		{
			_writer.write( "null" );
		}
		else
		{
			Class<?> type = obj.getClass();
			
			if( type.isArray() )
			{
				tabs( tabs );
				_writer.write( '[' );
				_writer.write( '\n' );
				int len = java.lang.reflect.Array.getLength( obj );
				for( int nth = 0; nth < len; nth++ )
				{
					Object item = java.lang.reflect.Array.get( obj, nth );
					write( item, tabs + 1 );
					_writer.write( '\n' );
				}
				tabs( tabs );
				_writer.write( ']' );
			}
			else if( Collection.class.isAssignableFrom( type ) )
			{
				Collection<?> c = (Collection<?>) obj;
				if( c.size() >  0 )
				{
					_writer.write( '\n' );
					tabs--;
					tabs( tabs );
					_writer.write( '[' );
					_writer.write( '\n' );
					for( Object item : c )
					{
						write( item, tabs + 1 );
						_writer.write( '\n' );
					}
					tabs( tabs );
					_writer.write( ']' );
				}
			}
			else if( Map.class.isAssignableFrom( type ) )
			{
				_writer.write( '\n' );
				tabs( tabs - 1 );
				_writer.write( '{' );
				_writer.write( '\n' );
				// TODO: Support non-String values?
				for( Map.Entry entry : ((Map<?, ?>) obj).entrySet()) 
				{
					Object key = entry.getKey();
					if( key == null ) continue;
					tabs( tabs );
					_writer.write( key.toString() );
					_writer.write( ' ' );
					write( entry.getValue(), tabs + 1 );
					_writer.write( '\n' );
				}
				tabs( tabs - 1 );
				_writer.write( '}' );
				_writer.write( '\n' );
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
				tabs( tabs );
				_writer.write( type.getName() );
				List<Field> fields = getFields( type );
				Object dupe = null;
				try 
				{
					dupe = type.newInstance();
				}
				catch( InstantiationException e1 ) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 ) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				_writer.write( '\n' );
				tabs( tabs );
				_writer.write( '(' );
				_writer.write( '\n' );
				tabs++;
				for( Field field : fields )
				{
					try 
					{
						Object spork = field.get( obj );
						boolean dirty = true;
						if( dupe != null )
						{
							Object dung = field.get( dupe );
							dirty = !equals( spork, dung );
						}
						if( dirty )
						{
							tabs( tabs );
							_writer.write( field.getName() );
							_writer.write( ' ' );
							write( spork, tabs + 1 );
							_writer.write( '\n' );
						}
					} 
					catch( IllegalArgumentException e ) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					catch( IllegalAccessException e ) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				tabs--;
				tabs( tabs );
				_writer.write( ')' );
			}
		}
		if( tabs < 1 )
		{
			_writer.write( '\n' );
			_writer.flush();
		}
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
	

}
