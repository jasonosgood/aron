// Generated from /Users/jasonosgood/Desktop/Projects/aron/src/aron/ARON.g4 by ANTLR 4.7
package aron;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ARONParser}.
 */
public interface ARONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ARONParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ARONParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ARONParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#includes}.
	 * @param ctx the parse tree
	 */
	void enterIncludes(ARONParser.IncludesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#includes}.
	 * @param ctx the parse tree
	 */
	void exitIncludes(ARONParser.IncludesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ARONParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ARONParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(ARONParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(ARONParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#combo}.
	 * @param ctx the parse tree
	 */
	void enterCombo(ARONParser.ComboContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#combo}.
	 * @param ctx the parse tree
	 */
	void exitCombo(ARONParser.ComboContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ARONParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ARONParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ARONParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ARONParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ARONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ARONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(ARONParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(ARONParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ARONParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ARONParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ARONParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ARONParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(ARONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(ARONParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(ARONParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(ARONParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#override}.
	 * @param ctx the parse tree
	 */
	void enterOverride(ARONParser.OverrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#override}.
	 * @param ctx the parse tree
	 */
	void exitOverride(ARONParser.OverrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(ARONParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(ARONParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ARONParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ARONParser.MethodContext ctx);
}