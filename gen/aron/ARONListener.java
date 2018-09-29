// Generated from /Users/jasonosgood/Desktop/Projects/aron/src/aron/ARON.g4 by ANTLR 4.7
package aron;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ARONParser}.
 */
public interface ARONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ARONParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(ARONParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(ARONParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(ARONParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(ARONParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(ARONParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(ARONParser.ImportDeclContext ctx);
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
	 * Enter a parse tree produced by {@link ARONParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ARONParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ARONParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ARONParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(ARONParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(ARONParser.ClassNameContext ctx);
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
	 * Enter a parse tree produced by {@link ARONParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(ARONParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ARONParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(ARONParser.EnumNameContext ctx);
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
}