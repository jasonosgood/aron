package aron;

public class 
	ARONException 
extends 
	Exception
{
	private static final long	serialVersionUID	= 1L;
	
	public ARONException( ParseNode node, Exception e )
	{
		super( node.radar(), e );
		
	}

}
