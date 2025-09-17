package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class VarRef implements ASTNode {
	
	public VarRef(String name) {
		super();
		this.name = name;
	}

	private String name;
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return symbolTable.get(name);
	}

}
