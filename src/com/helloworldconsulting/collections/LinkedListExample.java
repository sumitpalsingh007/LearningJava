package com.helloworldconsulting.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("C++");
        linkedList.addFirst("Java"); // Adds at the start
        linkedList.addLast("Python"); // Adds at the end

        // Accessing elements
        System.out.println(linkedList.get(0)); // Java

        // Removing elements
        linkedList.remove(1); // Removes "C++"
        System.out.println(linkedList); // [Java, Python]

        // Iterating over the list
        for (String language : linkedList) {
            System.out.println(language);
        }


    }
}
