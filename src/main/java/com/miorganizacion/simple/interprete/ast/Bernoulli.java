package com.miorganizacion.simple.interprete.ast;

import java.util.Map;

public class Bernoulli implements ASTNode {
    private ASTNode probExpr;

    public Bernoulli(ASTNode probExpr) {
        this.probExpr = probExpr;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object val = probExpr.execute(symbolTable);

        double p;
        if (val instanceof Integer) {
            p = ((Integer) val).doubleValue();
        } else if (val instanceof Double) {
            p = (Double) val;
        } else {
            throw new RuntimeException("Bernoulli espera un número como probabilidad.");
        }

        if (p < 0.0 || p > 1.0) {
            throw new RuntimeException("Probabilidad de Bernoulli fuera de rango (0 <= p <= 1).");
        }

        return Math.random() < p; // true con probabilidad p
    }
}
