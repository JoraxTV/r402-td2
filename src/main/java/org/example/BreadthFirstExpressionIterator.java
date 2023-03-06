package org.example;

import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstExpressionIterator {
    private Queue<Expression> elements = new LinkedList<>();

    public BreadthFirstExpressionIterator(Expression root) {
        elements.add(root);
    }

    public boolean hasNext() {
        return !elements.isEmpty();
    }

    public Expression current() {
        return elements.peek();
    }

    public void next() {
        Expression e = elements.remove();
        if (e instanceof AdditionExpression) {
            AdditionExpression ae = (AdditionExpression) e;
            elements.add(ae.left);
            elements.add(ae.right);
        } else if (e instanceof MultiplicationExpression) {
            MultiplicationExpression me = (MultiplicationExpression) e;
            elements.add(me.left);
            elements.add(me.right);
        }
    }
}