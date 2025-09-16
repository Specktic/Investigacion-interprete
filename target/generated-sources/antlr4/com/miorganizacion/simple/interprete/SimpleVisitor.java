// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(SimpleParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(SimpleParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(SimpleParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(SimpleParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleParser.ExpressionContext ctx);
}