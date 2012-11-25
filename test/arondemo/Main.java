package arondemo;

import java.io.File;

import aron.ARON;
import aron.ARONWriter;

public class 
	Main 
{
	public static final void main( String[] args )
		throws Exception
	{
		
		String filename = "./test/arondemo/demo.aron";
		File file = new File( filename );
		
		ARON aron = new ARON();		
		aron.load( file );
		Fruit parent = (Fruit) aron.getRegistry().get( "parent" );
		
		System.out.println( "found parent: " + ( parent != null ));
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
