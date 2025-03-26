package com.helloworldconsulting.designPatterns.structural.decorator;

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 50;
    }
}