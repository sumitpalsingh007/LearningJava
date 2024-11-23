package com.helloworldconsulting.collections;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<String> namesCollection = new HashSet<>();
        namesCollection.add("Alice");
        namesCollection.add("Bob");
        namesCollection.add("Charlie");

        Iterator<String> iterator = namesCollection.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            iterator.remove();
        }

        /*for(String input : namesCollection){
            System.out.println(input);
            namesCollection.remove("Charlie");
        }*/
    }
}
