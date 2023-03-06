package org.example;
class EvaluateExpressionVisitor  {
    private double result;
    public double getResult() {
        return result;
    }
    public void visit(AdditionExpression ae) {
        result = ae.left + ae.right;
    }
    public void visit(MultiplicationExpression me) {
        result = me.left * me.right;
    }
    public void visit(DoubleExpression de) {
        result = de.value;
    }
    public void visit(VariableExpression ve) {
        result = ve.value;
    }
}