package org.example;

public interface Calculator {
    int plus(int a, int b);
    int minus(int a, int b); // a - b 값 반환
    int mul(int a, int b); // a * b 값 반환
    int div(int a, int b); // a / b 값 반환
}

class Operator implements Calculator {
    public int plus(int a, int b) {
            return a + b;
    }
    public int minus(int a, int b) {
            return a - b;
    }
    public int mul(int a, int b) {
            return a * b;
    }
    public  int div(int a, int b) {
            return a / b;
    }
}