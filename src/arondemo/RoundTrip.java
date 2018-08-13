package arondemo;

/**
	ARON - A Righteous Object Notation
	
	Copyright (c) 2002, 2011, 2018 Jason Aaron Osgood, All rights reserved.
	
	Appropriate open source license will go here.
	
	Created: 2002/06/08 Jason Osgood <mrosgood@yahoo.com>
	Rewritten: 2011/10/01 Jason Osgood <jason@jasonosgood.com> 
 */

import aron.ARONReader;
import aron.ARONWriter;
import aron.LabelNode;

public class
	RoundTrip
{
	public static void main( String[] args )
		throws Exception
	{
		Fruit originalFruit = new Fruit();
		originalFruit.apple = "fuji";

		String originalData = ARONWriter.toString( originalFruit );
		LabelNode root = ARONReader.read( originalData );
		Fruit copyFruit = (Fruit) root.find( "unlabeled0" );
		String copyData = ARONWriter.toString( copyFruit );

		System.out.println( "fruit equals: " + originalFruit.equals( copyFruit ));
		System.out.println( "data equals: " + originalData.equals( copyData ));
	}
}
