package com.helloworldconsulting.designPatterns.creationpatterns;

public class CarBuilder {
    private String engine;
    private int wheels;
    private boolean airConditioning;
    private boolean sunroof;

    private int gears;

    private CarBuilder(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airConditioning = builder.airConditioning;
        this.sunroof = builder.sunroof;
        this.gears = builder.gears;
    }
    public static class Builder {
        private String engine;
        private int wheels;
        private boolean airConditioning;
        private boolean sunroof;

        private int gears;


        public Builder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }


        public Builder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setGears(int gears) {
            this.gears = gears;
            return this;
        }


        public CarBuilder build() {
            return new CarBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Wheels=" + wheels +
            ", Air Conditioning=" + airConditioning + ", Sunroof=" + sunroof + "]";
    }
}
