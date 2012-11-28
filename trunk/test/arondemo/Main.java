package arondemo;

import java.io.File;
import java.util.Map;

import aron.ARONReader;
import aron.ARONWriter;

public class 
	Main 
{
	public static final void main( String[] args )
		throws Exception
	{
		
		String filename = "./test/arondemo/demo.aron";
		File file = new File( filename );
		
		ARONReader aron = new ARONReader();		
		aron.read( file );
		Fruit parent = (Fruit) aron.getLabelMap().get( "parent" );
		Map<String,Object> registry = aron.getLabelMap();
		for( Map.Entry<String, Object> entry : registry.entrySet() )
		{
			System.out.printf( "label: %s  class: %s\n", entry.getKey(), entry.getValue().getClass().getName() );
		}
		
		System.out.println();
		
		ARONWriter writer = new ARONWriter( System.out );
		writer.write( parent );
	}		
}
