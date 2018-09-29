package arondemo;

import java.net.URL;

import aron.ARONReader;
import aron.ARONWriter;
import aron.AliasNode;
import aron.Document;

public class
	DemoViaURL 
{
	public static final void main( String[] args )
		throws Exception
	{
		URL url = ClassLoader.getSystemClassLoader().getResource( "arondemo/demo-override.aron" );
		
		ARONReader aron = new ARONReader();
		Document root = aron.read( url );
//		Fruit parent = (Fruit) root.find( "parent" );
		Object parent = root.children.get( 0 );
		System.out.println();
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
