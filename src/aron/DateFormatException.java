package aron;

public class 
	DateFormatException 
extends 
	IllegalArgumentException 
{
	private static final long serialVersionUID = 1L;
	
	public DateFormatException( String text )
	{
		super( String.format( "cannot parse date '%s', must be formatted '2000-01-01[T12:00:[00[Z]]]'", text ) );
	}
}
