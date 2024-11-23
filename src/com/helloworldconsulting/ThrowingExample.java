package com.helloworldconsulting;

public class ThrowingExample {
    public static void main(String[] args) {

        validateAge(-1);

        System.out.println("other actions");
    }

    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must not be negative");
        }
        System.out.println("Valid age: " + age);
    }
}
