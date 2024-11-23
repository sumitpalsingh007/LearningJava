package com.helloworldconsulting.functionalInterface;

public class MyClass {

    MyInterface s = () -> System.out.println("calling the functional interface method");

    public static void main(String[] args){

        MyClass myClass = new MyClass();
        myClass.s.apply();
    }
}
