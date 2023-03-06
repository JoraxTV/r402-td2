package org.example;


class NumberExpression  {

    private final int value;

    NumberExpression(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}