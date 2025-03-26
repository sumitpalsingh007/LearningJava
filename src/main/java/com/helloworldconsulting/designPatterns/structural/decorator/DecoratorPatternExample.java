package com.helloworldconsulting.designPatterns.structural.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Adding Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Adding Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
    }
}