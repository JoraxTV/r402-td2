package org.example;
class OperatorExpressionVisitor implements ExpressionVisitor {
    @Override
    public void visit(AdditionExpression ae) {
        System.out.println("AdditionExpression");
    }
    @Override
    public void visit(MultiplicationExpression me) {
        System.out.println("MultiplicationExpression");
    }
    @Override
    public void visit(DoubleExpression de) {
        System.out.println("DoubleExpression");
    }
    @Override
    public void visit(VariableExpression ve) {
        System.out.println("VariableExpression");
    }
}