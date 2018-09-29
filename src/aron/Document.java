package aron;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document
{
	public final URI source;
	public Document( URI source )
	{
		this.source = source;
	}

	public List<Document> includes = new ArrayList<>();

	public void addInclude( Document child )
	{
		includes.add( child );
	}

	public List<Object> children = new ArrayList<>();

	public void addChild( Object child )
	{
		children.add( child );
	}

	public Map<String, Object> aliasMap = new HashMap<>();

	public void putAlias( String alias, Object instance )
	{
		if( alias == null ) return;

		aliasMap.put( alias, instance );
	}

	public Object getAlias( String alias )
	{
		if( alias != null )
		{
			if( aliasMap.containsKey( alias ))
			{
				return aliasMap.get( alias );
			}
			else
			{
				for( Document d : includes )
				{
					Object found = d.getAlias( alias );
					if( found != null ) return found;
				}
			}
		}

		return null;
	}

	// TOOD: Iterate children of Document composite, maybe, if ever needed
}
