package helloworldconsulting.generics;

import java.util.ArrayList;

public class WithGenericsExample {
    public static void main(String[] args) {
        // Create a list that only accepts Strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(42); // Compilation error if uncommented

        // No need to cast when retrieving elements
        String str = list.get(0);
        System.out.println(str);
    }
}
