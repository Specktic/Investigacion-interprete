package com.miorganizacion.simple.interprete.ast;

public class And implements ASTNode{
    private ASTNode left;
    private ASTNode right;

    public And(ASTNode left, ASTNode right){
        this.left =  left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable){
        Object l = left.execute(symbolTable);
        Object r = right.execute(symbolTable);

        if (!(l instanceof Boolean) || !(r instanceof Boolean)) {
            throw new RuntimeException("ambos deven de ser booleanos");
        }

        return (Boolean) l && (Boolean) r;

    }
}
