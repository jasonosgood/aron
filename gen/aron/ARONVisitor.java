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
	 * Visit a parse tree produced by {@link ARONParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ARONParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#includes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(ARONParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(ARONParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(ARONParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#combo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombo(ARONParser.ComboContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ARONParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ARONParser.PropertyContext ctx);
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
	 * Visit a parse tree produced by {@link ARONParser#integerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerList(ARONParser.IntegerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#floatList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatList(ARONParser.FloatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#timestampList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampList(ARONParser.TimestampListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#booleanList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanList(ARONParser.BooleanListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(ARONParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#childList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildList(ARONParser.ChildListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ARONParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(ARONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ARONParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(ARONParser.KeyContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link ARONParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ARONParser.MethodContext ctx);
}