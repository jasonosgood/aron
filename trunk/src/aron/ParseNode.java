package aron;

/**
	ARON - A Righteous Object Notation
	
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.
	
	Appropriate open source license will go here.
	
	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 
*/

import org.antlr.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 
	ParseNode 
{
	static HashMap<String,Integer> lexMap = new HashMap<String,Integer>();
	
	public static void addLexType( String name, int type )
	{
		lexMap.put( name, type );
	}
	
	public static int getLexType( String name )
	{
		int result = 0;
		if( lexMap.containsKey( name ))
		{
			result = lexMap.get( name );
		}
		return result;
	}
	
	private String _ruleName;
//	public List<?> hiddenTokens;

	public ParseNode( String ruleName ) 
	{
		_ruleName = ruleName;
	}

	ArrayList<Object> _children = new ArrayList<Object>();
	
	public void addChild( Object child )
	{
		_children.add( child );
	}
	
	public int getChildCount()
	{
		return _children.size();
	}
	
	public Object getChild( int index )
	{
		return _children.get( index );
	}
	
	public List<Object> getChildren()
	{
		return _children;
	}
	
	public Token getToken( int index )
	{
		int count = index;
		for( Object temp : _children )
		{
			if( temp instanceof Token )
			{
				Token token = (Token) temp;
				if( token.getChannel() != Token.HIDDEN_CHANNEL )
				{
					if( count == 0 )
					{
						return token;
					}
					else
					{
						count--;
					}
				}
			}
		}
		return null;
	}
	
	public String toString() {
//		return _ruleName;
		
		return radar();
		
		
//		if ( _ruleName instanceof Token ) {
//			Token t = (Token)_ruleName;
//			if ( t.getType() == Token.EOF ) {
//				return "<EOF>";
//			}
//			return t.getText();
//		}
//		return _ruleName.toString();
	}

	public String toParseTree()
	{
		StringBuilder sb = new StringBuilder();
		toParseTree( sb, 0, this );
		return sb.toString();
	}
	
	public static void toParseTree( StringBuilder sb, int indent, ParseNode node )
	{
		for( int x = 0; x < indent; x++ )
		{
			sb.append( "  " );
		}
		sb.append( "( " );
		sb.append( node.getRule() );
		sb.append( "\n" );
		for( Object child : node._children )
		{
			if( child instanceof ParseNode )
			{
				toParseTree( sb, indent + 1, (ParseNode) child );
			}
			else if( child instanceof Token )
			{
				Token token = (Token) child;
				if( token.getChannel() != token.HIDDEN_CHANNEL )
				{
					for( int x = 0; x < indent + 1; x++ )
					{
						sb.append( "  " );
					}
					sb.append( token.getType() );
					sb.append( ":" );
					sb.append( token.getText() );
					sb.append( "\n" );
				}
			}
		}
		for( int x = 0; x < indent; x++ )
		{
			sb.append( "  " );
		}
		sb.append( ")" );
		sb.append( "\n" );
	}
	
	public String toInputString()
	{
		StringBuilder sb = new StringBuilder();
		toInputString( sb, this );
		return sb.toString();
	}
	
	public static void toInputString( StringBuilder sb, ParseNode node )
	{
		for( Object child : node._children )
		{
			if( child instanceof ParseNode )
			{
				toInputString( sb, (ParseNode) child );
			}
			else if( child instanceof Token )
			{
				Token token = (Token) child;
				if( token.getChannel() != token.HIDDEN_CHANNEL )
				{
					sb.append( token.getText() );
				}
			}
		}
	}
	
	public String getRule()
	{
		return _ruleName;
	}
	
	public List<Object> find( String expression )
	{
		return find( expression, false );
	}
	
	public List<ParseNode> findNodes( String expression )
	{
		List<Object> list = find( expression );
		ArrayList<ParseNode> result = new ArrayList<ParseNode>();
		for( Object ugh : list )
		{
			if( ugh instanceof ParseNode )
			{
				result.add( (ParseNode) ugh );
			}
		}
		return result;
	}
	
	// TODO: validate expression
	protected List<Object> find( String expression, boolean first )
	{
		if( expression == null )
		{
			throw new NullPointerException( "expression" );
		}
		
		ArrayList<String> query = new ArrayList<String>();
		for( String atom : expression.split( "/" ))
		{
			atom = atom.trim();
			if( atom.length() == 0 )
			{
				throw new IllegalArgumentException( query + " contains empty match string" );
			}
			query.add( atom );
		}
		
		ArrayList<Object> result = new ArrayList<Object>();
		find( first, this, query, 0, false, result );
		return result;
	}

	private static void find( boolean first, ParseNode parent, ArrayList<String> query, int nth, boolean seeking, ArrayList<Object> result )
	{
		String spot = query.get( nth );
		for( Object child : parent._children )
		{
			if( child instanceof Token && Character.isUpperCase( spot.charAt( 0 )) )
			{
				Token token = (Token) child;
				int type = getLexType( spot );
				if( token.getType() == type )
				{
					result.add( token );
				}
			}
			else if( child instanceof ParseNode )
			{
				ParseNode node = (ParseNode) child;
				if( "*".equals( spot ) || node.getRule().equals( spot ))
				{
					if( nth + 1 < query.size() )
					{
						find( first, node, query, nth + 1, false, result );
					}
					else
					{
						result.add( node );
					}
				}
				else if( "**".equals( spot ))
				{
					find( first, node, query, nth + 1, true, result );
				}
				else if( seeking )
				{
					find( first, node, query, nth, true, result );
				}
			}
			
			if( first && result.size() > 0 ) break;
		}
	}

	public Object findFirst( String expression )
	{
		Object result = null;
		List<Object> found = find( expression, true );
		if( found.size() > 0 )
		{
			result = found.get( 0 );
		}
		return result;
	}
	
	public ParseNode findFirstNode( String expression )
	{
		ParseNode result = null;
		Object first = findFirst( expression );
		if( first instanceof ParseNode )
		{
			result = (ParseNode) first;
		}
		return result;
	}
	
	public String findFirstString( String expression )
	{
		String result = null;
		Object first = findFirst( expression );
		if( first instanceof Token )
		{
			result = ((Token) first).getText();
		}
//		if( first != null )
//		{
//			Token token = first.getToken();
//			if( token != null )
//			{
//				result = token.getText();
//			}
//		}
		return result;
	}
	
	public String radar()
	{
		Token token = getToken( 0 );
		int line = -1;
		int pos = -1;
		if( token != null )
		{
			line = token.getLine();
			pos = token.getCharPositionInLine();
		}
		String text = toInputString();
		return String.format( "error %d:%d %s", line, pos, text );

	}
	
	
	
}
