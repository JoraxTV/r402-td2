package org.example;



interface ExpressionVisitor {
    void visit(AdditionExpression ae);
    void visit(MultiplicationExpression me);
    void visit(DoubleExpression de);
    void visit(VariableExpression ve);
}
