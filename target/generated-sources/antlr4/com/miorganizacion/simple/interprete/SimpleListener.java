// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SimpleParser.StartContext ctx);
}