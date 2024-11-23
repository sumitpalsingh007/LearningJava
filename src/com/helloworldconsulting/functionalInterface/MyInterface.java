package com.helloworldconsulting.functionalInterface;

@FunctionalInterface
public interface MyInterface {
    public void apply();

    //public void apply1();
    default void anotherMethod() {
        System.out.println("This is a default method.");
    }
}
