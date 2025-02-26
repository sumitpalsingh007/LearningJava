package com.helloworldconsulting.regex;

public class ReplaceExample {
    public static void main(String[] args) {
        String input = "Order ID: 12345, Customer: John";
        String result = input.replaceAll("\\d+", "XXXX");
        System.out.println(result);
    }
}
