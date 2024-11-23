package com.helloworldconsulting;

public class MethodAssertionExample {
    public static void main(String[] args) {
        int result = factorial(-5);
        System.out.println("Factorial: " + result);
    }

    static int factorial(int n) {
        assert n >= 0 : "n must be non-negative";
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
