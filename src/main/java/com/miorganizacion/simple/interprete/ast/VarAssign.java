package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class VarAssign implements ASTNode {

	public VarAssign(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}

	private String name;
	private ASTNode expression;
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		symbolTable.put(name, expression.execute(symbolTable));
		return null;
	}

}
