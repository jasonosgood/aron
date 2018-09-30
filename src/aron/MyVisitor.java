package aron;

import aron.ARONParser.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class MyVisitor
extends AbstractParseTreeVisitor<Void>
implements ARONVisitor<Void>
{
	private ArrayList<String> _importDefs;
	private HashMap<String, Class<?>> _shortNames = new HashMap<>();

	@Override public Void visitDocument( DocumentContext ctx )
	{
		return visitChildren( ctx );
	}

	@Override public Void visitInclude( IncludeContext ctx )
	{

		return visitChildren( ctx );
	}

	@Override public Void visitImportDecl( ImportDeclContext ctx )
	{
		try
		{
			ClassNameContext id = ctx.className();
			String name = id.getText();

			Class<?> clazz = Class.forName( name );
			int nth = clazz.toString().lastIndexOf( (int) '.' );
			String shortie = clazz.toString().substring( nth + 1 );
			_shortNames.put( shortie, clazz );
		}
		catch( ClassNotFoundException e )
		{
			System.out.println( e );
		}

		return visitChildren( ctx );
	}

	String capitalize( String propertyName )
	{
		if (propertyName.length() == 0) return null;
		return propertyName.substring( 0, 1 ).toUpperCase() + propertyName.substring( 1 );
	}

	Method findMethod( Object bean, String property )
	{

		String[] names = new String[]
		{
			property,
			"set" + capitalize( property ),
			"set" + property.toUpperCase(),
			capitalize( property ),
			property.toUpperCase(),
			"add" + capitalize( property ),
			"add" + property.toUpperCase()
		};

//		var methods = new ArrayList<Method>();

		for( Method m : bean.getClass().getMethods() )
		{
			for( String name : names )
			{
				if(
					m.getName().equals( name )
					&& m.getParameterTypes().length == 1
				)
				{
//					methods.add( m );
				}
			}
		}
		return null;
	}

//	Stack<String> methodStack
	@Override public Void visitMap( MapContext ctx )
	{
		return visitChildren( ctx );
	}

	@Override public Void visitAlias( AliasContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitClassName( ClassNameContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitPair( PairContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitValue( ValueContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitScalar( ScalarContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitList( ListContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitKey( KeyContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitEnumName( EnumNameContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitOverride( OverrideContext ctx ) { return visitChildren( ctx ); }

	@Override public Void visitReference( ReferenceContext ctx ) { return visitChildren( ctx ); }
}