package helloworldconsulting.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();


        set.add("Orange");
        set.add("Banana");
        set.add("Apple");
        set.add("Apple");

        System.out.println(set);


        System.out.println(set.contains("Banana"));


        set.remove("Orange");

        System.out.println(set); // Output could be [Banana, Apple]
    }
}
