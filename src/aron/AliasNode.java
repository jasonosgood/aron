package aron;

import java.util.ArrayList;
import java.util.List;

public class
AliasNode
{
	private String _label;
	private Object _object;
	
	public AliasNode( String label, Object object )
	{
		_label = label;
		_object = object;
	}
	
	public String getLabel() { return _label; }
	
	public Object getObject() { return _object; }
	
	private ArrayList<AliasNode> _children = new ArrayList<AliasNode>();
	
	public List<AliasNode> getChildren()
	{
		return _children;
	}
	
	public void addChild( AliasNode child )
	{
		if( child == null )
		{
			throw new NullPointerException( "child" );
		}
		
		_children.add( child );
	}

	// TODO: Decide to keep nested alias (or not) and if yes migrate find method to Document
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
		
		Object result = null; 
		AliasNode found = find( this, query, 0 );
		if( found != null )
		{
			result = found.getObject();
		}
		return result;
	}

	protected AliasNode find( AliasNode parent, ArrayList<String> query, int nth )
	{
		String spot = query.get( nth );
		
		for( AliasNode child : parent._children )
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
	
//	public String toString()
//	{
//		return String.format( "label: %s  object: [%s]  children count: %d", _label, _object, _children.size() );
//	}
}
