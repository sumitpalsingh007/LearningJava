package com.helloworldconsulting.regex;

import java.util.regex.*;

public class PrecompiledPatternExample {
    private static final Pattern pattern = Pattern.compile("\\d+");

    public static void main(String[] args) {
        String input = "Item 123 costs $45";
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
