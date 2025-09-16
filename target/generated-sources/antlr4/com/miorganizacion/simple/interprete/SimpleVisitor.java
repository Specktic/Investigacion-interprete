// Generated from com\miorganizacion\simple\interprete\Simple.g4 by ANTLR 4.9.2
package com.miorganizacion.simple.interprete;
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
	 * Visit a parse tree produced by {@link SimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SimpleParser.StartContext ctx);
}