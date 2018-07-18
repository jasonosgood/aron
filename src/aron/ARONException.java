package aron;

import org.antlr.v4.runtime.ParserRuleContext;

public class
	ARONException 
extends 
	Exception
{
	private static final long	serialVersionUID	= 1L;
	
	public ARONException( ParserRuleContext node, Exception e )
	{
		super( node.toStringTree(), e );
		
	}

}
