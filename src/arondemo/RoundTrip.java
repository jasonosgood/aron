package arondemo;

import aron.ARONReader;
import aron.ARONWriter;
import aron.Document;

import java.io.File;
import java.io.StringWriter;
import java.util.Date;

public class
	RoundTrip
{
	public static final void main( String[] args )
		throws Exception
	{
		File pwd = new File( "." );
		String filename = "./src/arondemo/demo.aron";
		File file = new File( filename );
		System.out.println( "root1: " + file.getCanonicalPath() );
		System.out.println( "root2: " + file.getAbsolutePath() );

		ARONReader aron = new ARONReader();
		Document root = aron.read( file );
		Fruit parent = (Fruit) root.children.get( 0 );
		System.out.println();

		StringWriter sw = new StringWriter();
		ARONWriter writer = new ARONWriter( sw );
		writer.write( parent );
//		System.out.println( sw.toString() );

		ARONReader aron2 = new ARONReader();
		Document root2 = aron2.read( sw.toString() );
		Fruit parent2 = (Fruit) root2.children.get( 0 );

		System.out.println( "fruit equals: " + parent2.equals( parent2 ));
	}
}
