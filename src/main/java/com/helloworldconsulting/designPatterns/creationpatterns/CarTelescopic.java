package com.helloworldconsulting.designPatterns.creationpatterns;

public class CarTelescopic {
    private String engine;
    private int wheels;
    private boolean airConditioning;
    private boolean sunroof;

    private int gears;

    public CarTelescopic(String engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public CarTelescopic(String engine, int wheels, boolean airConditioning) {
        this(engine, wheels);
        this.airConditioning = airConditioning;
    }

    public CarTelescopic(String engine, int wheels, boolean airConditioning, boolean sunroof) {
        this(engine, wheels, airConditioning);
        this.sunroof = sunroof;
    }
    public CarTelescopic(String engine, int wheels, boolean airConditioning, boolean sunroof, int gears) {
        this(engine, wheels, airConditioning, sunroof);
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Wheels=" + wheels +
            ", Air Conditioning=" + airConditioning + ", Sunroof=" + sunroof + "]";
    }
}
