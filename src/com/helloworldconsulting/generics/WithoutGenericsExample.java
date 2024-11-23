package com.helloworldconsulting.generics;

import java.util.ArrayList;

public class WithoutGenericsExample {
    public static void main(String[] args) {
        // Create a list to hold objects
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(42); // Adding an integer

        // Cast when retrieving
        String str = (String) list.get(0);
        System.out.println(str);

        // Causes a ClassCastException at runtime if cast is wrong
        String num = (String) list.get(1); // Throws exception
    }
}
