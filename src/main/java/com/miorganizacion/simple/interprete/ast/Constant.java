package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class Constant implements ASTNode {
	
	public Constant(Object value) {
		super();
		this.value = value;
	}

	private Object value;
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return value;
	}

}
