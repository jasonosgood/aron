package arondemo;

import java.io.File;
import java.util.Map;

import aron.ARONReader;
import aron.ARONWriter;
import aron.LabelNode;

public class 
	Main 
{
	public static final void main( String[] args )
		throws Exception
	{
		
		String filename = "./test/arondemo/demo.aron";
		File file = new File( filename );
		
		ARONReader aron = new ARONReader();		
		LabelNode root = aron.read( file );
		Fruit parent = (Fruit) root.find( "parent" );
		System.out.println();
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
