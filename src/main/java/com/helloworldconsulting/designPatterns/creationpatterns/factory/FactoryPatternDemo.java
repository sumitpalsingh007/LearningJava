package com.helloworldconsulting.designPatterns.creationpatterns.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive();

        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.drive();

        Vehicle test = VehicleFactory.getVehicle("test");
        truck.drive();
    }
}