package org.example;

abstract class Expression {
    
        abstract int evaluate();
    
        @Override
        public String toString() {
            return String.valueOf(evaluate());
        }
}