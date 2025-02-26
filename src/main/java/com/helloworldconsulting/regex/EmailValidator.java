package com.helloworldconsulting.regex;

import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

        if (email.matches(regex)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}
