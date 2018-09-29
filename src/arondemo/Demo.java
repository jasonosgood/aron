package arondemo;

import java.io.File;

import aron.ARONReader;
import aron.AliasNode;
import aron.Document;

public class 
	Demo 
{
	public static final void main( String[] args )
		throws Exception
	{
		File pwd = new File( "." );
		System.out.println( "root: " + pwd.getCanonicalPath() );
		String filename = "./src/arondemo/demo.aron";
//		String filename = "./src/arondemo/demo-override.aron";
		File file = new File( filename );

		ARONReader aron = new ARONReader();
		Document root = aron.read( file );
//		Fruit parent = (Fruit) root.find( "parent" );
		Fruit parent = (Fruit) root.children.get( 0 );
		System.out.println();
		
//		ARONWriter writer = new ARONWriter( System.out );
//		writer.write( parent );
	}		
}
