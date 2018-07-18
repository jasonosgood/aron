package arondemo;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

import aron.ARONReader;
import aron.ARONWriter;
import aron.LabelNode;
import java.nio.file.*;
public class 
	DemoViaURL 
{
	public static final void main( String[] args )
		throws Exception
	{
		URL url = ClassLoader.getSystemClassLoader().getResource( "arondemo/demo-override.aron" );
		

		ARONReader aron = new ARONReader();		
		LabelNode root = aron.read( url );
		Fruit parent = (Fruit) root.find( "parent" );
		System.out.println();
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
