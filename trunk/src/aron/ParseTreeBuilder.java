package aron;

/**
	ARON - A Righteous Object Notation
	
	Copyright (c) 2002, 2011 Jason Aaron Osgood, All rights reserved.
	
	Appropriate open source license will go here.
	
	Created: 06/08/2002 Jason Osgood <mrosgood@yahoo.com>
	Updated: 10/01/2011 Jason Osgood <jason@jasonosgood.com> 
*/

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.debug.BlankDebugEventListener;

import java.util.Stack;

/** 
 * Captures parse tree from execution of grammar. 
 */

public class 
	ParseTreeBuilder 
extends 
	BlankDebugEventListener 
{
	Stack<ParseNode> _stack = new Stack<ParseNode>();
	int backtracking = 0;

	public ParseTreeBuilder() 
	{
		ParseNode root = new ParseNode( "<>" );
		_stack.push( root );
	}

	public ParseNode getTree() 
	{
		return _stack.elementAt( 0 );
	}

	/** Backtracking or cyclic DFA, don't want to add nodes to tree */
	/** I don't even know what this stuff does... -- Jason */
	public void enterDecision( int d ) 
	{ 
		backtracking++; 
	}
	
	public void exitDecision( int i ) 
	{ 
		backtracking--; 
	}

	public void enterRule( String filename, String rule ) 
	{
		if( backtracking > 0 ) return;
		ParseNode top = _stack.peek();
		ParseNode child = new ParseNode( rule );
		top.addChild( child );
		_stack.push( child );
	}

	public void exitRule( String filename, String ruleName ) 
	{
		if( backtracking > 0 ) return;
		_stack.pop();		
	}

	public void consumeToken( Token token ) 
	{
		if( backtracking > 0 ) return;
		ParseNode top = _stack.peek();
		top.addChild( token );
	}

	public void consumeHiddenToken( Token token ) 
	{
		consumeToken( token );
	}

	public void recognitionException( RecognitionException e ) 
	{
		if( backtracking > 0 ) return;
		ParseNode ruleNode = _stack.peek();
		ruleNode.addChild( e );
	}
}
