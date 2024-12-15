package helloworldconsulting.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //List<Integer> oddNumbers = new ArrayList<>();

        /*for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }*/

        Stream<Integer> s = numbers.stream()
                .filter(num -> (num % 2 != 0))
                .map(num -> (num * 2));

        List<Integer> oddNumbers = s.collect(Collectors.toList());

        System.out.println("Odd numbers: " + oddNumbers);

        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "John");

        List<String> result = names.stream()          // Source
                .filter(st -> st.length() > 3)   // Intermediate operation (filter)
                .map(String::toUpperCase)      // Intermediate operation (map)
                .sorted()                      // Intermediate operation (sorted)
                .collect(Collectors.toList()); // Terminal operation (collect)

    }
}
