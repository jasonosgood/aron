package aron;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

public class 
	LabelNode 
{
	private String _label;
	private Object _object;
	
	public LabelNode( String label, Object object )
	{
		_label = label;
		_object = object;
	}
	
	public String getLabel() { return _label; }
	
	public Object getObject() { return _object; }
	
	private ArrayList<LabelNode> _children = new ArrayList<LabelNode>();
	
	public void addChild( LabelNode child )
	{
		if( child == null )
		{
			throw new NullPointerException( "child" );
		}
		
		_children.add( child );
	}
	
	// TODO: validate expression
	public Object find( String expression )
	{
		if( expression == null )
		{
			throw new NullPointerException( "expression" );
		}
		
		ArrayList<String> query = new ArrayList<String>();
		String[] list = expression.split( "\\." );
		for( String atom : list )
		{
			atom = atom.trim();
			if( atom.length() == 0 )
			{
				throw new IllegalArgumentException( query + " contains empty match string" );
			}
			query.add( atom );
		}
		
		LabelNode found = find( this, query, 0 );
		Object result = found.getObject();
		return result;
	}

	protected LabelNode find( LabelNode parent, ArrayList<String> query, int nth )
	{
		String spot = query.get( nth );
		
		for( LabelNode child : parent._children )
		{
			if( spot.equals( child._label ))
			{
				if( nth + 1 < query.size() )
				{
					return find( child, query, nth + 1 );
				}
				else
				{
					return child;
				}
			}
		}
		return null;
	}
}
