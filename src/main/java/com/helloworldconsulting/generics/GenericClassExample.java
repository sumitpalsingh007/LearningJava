package helloworldconsulting.generics;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Create a Box to hold Strings
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get().getClass() + " " + stringBox.get());

        // Create a Box to hold Integers
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        System.out.println(integerBox.get().getClass() + " " + integerBox.get());
    }
}
