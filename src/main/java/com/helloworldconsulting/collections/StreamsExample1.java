package helloworldconsulting.collections;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("John");

        List<String> modifiedNames = new ArrayList<>();


        for (String name : names) {
            modifiedNames.add(name.toUpperCase());
        }

        // Printing the result
        System.out.println("Modified names: " + modifiedNames);
    }
}
