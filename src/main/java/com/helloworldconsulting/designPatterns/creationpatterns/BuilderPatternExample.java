package com.helloworldconsulting.designPatterns.creationpatterns;

public class BuilderPatternExample {
    public static void main(String[] args) {

        CarBuilder car1 = new CarBuilder.Builder("V8", 4)
            .setAirConditioning(true)
            .setSunroof(true)
            .setGears(5)
            .build();

        CarBuilder car2 = new CarBuilder.Builder("V6", 4)
            .setAirConditioning(false)
            .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
