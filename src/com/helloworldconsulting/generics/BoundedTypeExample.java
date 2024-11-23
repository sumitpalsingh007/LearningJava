package com.helloworldconsulting.generics;

class BoundedBox<T extends Number> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    // A method that adds the item to itself
    public double getDoubleValue() {
        return item.doubleValue() * 2;
    }
}

public class BoundedTypeExample {
    public static void main(String[] args) {
        BoundedBox<Integer> intBox = new BoundedBox<>();
        intBox.set(10);
        System.out.println("Double value: " + intBox.getDoubleValue());

        BoundedBox<Double> doubleBox = new BoundedBox<>();
        doubleBox.set(5.5);
        System.out.println("Double value: " + doubleBox.getDoubleValue());

        //BoundedBox<String> strBox = new BoundedBox<>(); // Compilation error, String is not a Number
    }
}













//Wildcards
//? (Unbounded Wildcard): Represents any type.
//        ? extends Type: is a subclass of Type.
//        ? super Type: is a superclass of Type.