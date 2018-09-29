// Generated from /Users/jasonosgood/Desktop/Projects/aron/src/aron/ARON.g4 by ANTLR 4.7
package aron;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ARONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ARONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ARONParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(ARONParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(ARONParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(ARONParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ARONParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(ARONParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ARONParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(ARONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ARONParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(ARONParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ARONParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(ARONParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(ARONParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverride(ARONParser.OverrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(ARONParser.ReferenceContext ctx);
}