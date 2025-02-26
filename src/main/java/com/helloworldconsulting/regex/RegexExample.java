package com.helloworldconsulting.regex;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String input = "The price is $123.45";
        String regex = "\\d+\\.\\d+"; // Matches a decimal number

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }
    }
}
