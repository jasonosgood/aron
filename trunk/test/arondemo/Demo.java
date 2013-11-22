package arondemo;

import java.io.File;
import java.util.Map;

import aron.ARONReader;
import aron.ARONWriter;
import aron.LabelNode;

public class 
	Demo 
{
	public static final void main( String[] args )
		throws Exception
	{
		File pwd = new File( "." );
		System.out.println( "root: " + pwd.getCanonicalPath() );
//		String filename = "./test/arondemo/demo.aron";
		String filename = "./test/arondemo/demo-override.aron";
//		String filename = "/Users/jasonosgood/git/martini/classes/testify/MyMain.aron";
		File file = new File( filename );
		
		ARONReader aron = new ARONReader();		
		LabelNode root = aron.read( file );
		Fruit parent = (Fruit) root.find( "parent" );
		System.out.println();
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
