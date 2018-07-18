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
	 * Enter a parse tree produced by {@link ARONParser#klass}.
	 * @param ctx the parse tree
	 */
	void enterKlass(ARONParser.KlassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#klass}.
	 * @param ctx the parse tree
	 */
	void exitKlass(ARONParser.KlassContext ctx);
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
	 * Enter a parse tree produced by {@link ARONParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(ARONParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(ARONParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#kid}.
	 * @param ctx the parse tree
	 */
	void enterKid(ARONParser.KidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#kid}.
	 * @param ctx the parse tree
	 */
	void exitKid(ARONParser.KidContext ctx);
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
	 * Enter a parse tree produced by {@link ARONParser#emptyList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(ARONParser.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#emptyList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(ARONParser.EmptyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#integerList}.
	 * @param ctx the parse tree
	 */
	void enterIntegerList(ARONParser.IntegerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#integerList}.
	 * @param ctx the parse tree
	 */
	void exitIntegerList(ARONParser.IntegerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#floatList}.
	 * @param ctx the parse tree
	 */
	void enterFloatList(ARONParser.FloatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#floatList}.
	 * @param ctx the parse tree
	 */
	void exitFloatList(ARONParser.FloatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#timestampList}.
	 * @param ctx the parse tree
	 */
	void enterTimestampList(ARONParser.TimestampListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#timestampList}.
	 * @param ctx the parse tree
	 */
	void exitTimestampList(ARONParser.TimestampListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#booleanList}.
	 * @param ctx the parse tree
	 */
	void enterBooleanList(ARONParser.BooleanListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#booleanList}.
	 * @param ctx the parse tree
	 */
	void exitBooleanList(ARONParser.BooleanListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(ARONParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(ARONParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#childList}.
	 * @param ctx the parse tree
	 */
	void enterChildList(ARONParser.ChildListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#childList}.
	 * @param ctx the parse tree
	 */
	void exitChildList(ARONParser.ChildListContext ctx);
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
	 * Enter a parse tree produced by {@link ARONParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(ARONParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(ARONParser.PathContext ctx);
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