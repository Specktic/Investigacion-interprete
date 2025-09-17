package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class VarDecl implements ASTNode {
	
	public VarDecl(String name) {
		super();
		this.name = name;
	}

	private String name;
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		symbolTable.put(name, new Object());
		return null;
	}
}
