package arondemo;

/**
	ARON - A Righteous Object Notation
	
	Copyright (c) 2002, 2011, 2018 Jason Aaron Osgood, All rights reserved.
	
	Appropriate open source license will go here.
	
	Created: 2002/06/08 Jason Osgood <mrosgood@yahoo.com>
	Rewritten: 2011/10/01 Jason Osgood <jason@jasonosgood.com> 
 */

import aron.ARONWriter;

import java.io.OutputStreamWriter;

public class
	Cronk
{
	public static void main( String[] args )
		throws Exception
	{
		OutputStreamWriter ugh = new OutputStreamWriter(System.out);
		ARONWriter w = new ARONWriter( ugh );

		Fruit fruit = new Fruit();
		w.write( fruit );

		ugh.close();
	}
}
