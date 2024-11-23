package com.helloworldconsulting;

public class CarExample {

    public static void main(String[] args) {
        Car manCar = new ManualTransmissionCar("Black", "Manual", 2024);
        //manCar.displayInfo();
        manCar.drive(); // Run time Polymorphism - actual object type
        //manCar.transmitt();
        //manCar.setUpGear(); // Compile time Polymorphism
        //manCar.setUpGear(3);
        //manCar.setUpGear(3, 5);

        Car autCar = new AutomaticTransmissionCar("White", "Automatic", 2024);
        //autCar.displayInfo();
        autCar.drive();
        //autCar.transmitt();
    }
}
