package helloworldconsulting.generics;

class GenericMethods {
    // A generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element.getClass() + " " + element);
        }
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {
        // Print an array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericMethods.printArray(intArray);

        // Print an array of Strings
        String[] stringArray = {"Hello", "World"};
        GenericMethods.printArray(stringArray);
    }
}
