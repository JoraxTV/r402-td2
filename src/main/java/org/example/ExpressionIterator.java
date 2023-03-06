package org.example;



// Interface définissant les méthodes pour parcourir un arbre d'expression
interface ExpressionIterator {
    void visit(AdditionExpression ae);
    void visit(MultiplicationExpression me);
    void visit(DoubleExpression de);
    void visit(VariableExpression ve);
}
