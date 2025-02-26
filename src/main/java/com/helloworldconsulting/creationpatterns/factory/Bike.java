package com.helloworldconsulting.creationpatterns.factory;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike is driving...");
    }
}