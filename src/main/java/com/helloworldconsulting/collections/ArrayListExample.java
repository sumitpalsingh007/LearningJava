package helloworldconsulting.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List arrayList = new ArrayList();

        arrayList.add("Java"); // 0
        arrayList.add("Python"); // 1
        arrayList.add("JavaScript"); // 2

        // Accessing elements
        System.out.println(arrayList.get(2)); // Java

        // Iterating over the list
        for (Object language : arrayList) {
            System.out.println(language);
        }
        for(int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // Adding an element at a specific position
        arrayList.add(1, "C++");
        System.out.println(arrayList); // [Java, C++, Python, JavaScript]
    }
}
