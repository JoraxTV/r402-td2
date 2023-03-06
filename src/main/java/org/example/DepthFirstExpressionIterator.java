package org.example;


import java.util.ArrayList;
import java.util.List;

class DepthFirstExpressionIterator {
    private List<Expression> elements = new ArrayList<>();

    public DepthFirstExpressionIterator(Expression root) {
        elements.add(root);
    }

    public boolean hasNext() {
        return !elements.isEmpty();
    }

    public Expression current() {
        return elements.get(elements.size() - 1);
    }

    public void next() {
        Expression e = elements.remove(elements.size() - 1);
        if (e instanceof AdditionExpression) {
            AdditionExpression ae = (AdditionExpression) e;
            elements.add(ae.right);
            elements.add(ae.left);
        } else if (e instanceof MultiplicationExpression) {
            MultiplicationExpression me = (MultiplicationExpression) e;
            elements.add(me.right);
            elements.add(me.left);
        }
    }
}