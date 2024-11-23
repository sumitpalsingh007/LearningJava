package com.helloworldconsulting;

public class BasicAssertionExample {
    public static void main(String[] args) {
        System.out.println("testing");
        int value = 10;
        assert value > 0 : "Value should be positive";
        assert value < 5 : "Value is less than 5";
    }
}
