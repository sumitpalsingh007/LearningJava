package com.helloworldconsulting.collections;

import java.util.HashMap;
import java.util.Objects;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return year == car.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }//69972801, -1783829156, -227645020 ---------- 2051, 2050, 2051

    @Override
    public String toString() {
        return model + " (" + year + ")";
    }
}

public class HashMapCustomObjectKeyExample {
    public static void main(String[] args) {
        HashMap<Car, String> map = new HashMap<>();

        // Adding custom objects as keys
        map.put(new Car("Honda", 2020), "Sedan");
        map.put(new Car("Toyota", 2019), "SUV");
        map.put(new Car("Honda City", 2020), "Compact");


        System.out.println(map.get(new Car("Honda City", 2020)));
        // Retrieving values by custom key
        for (HashMap.Entry<Car, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


//69972801 - Honda 2020, Sedan
//-1783829156 - Toyota, 2019, SUV
//-227645020 - Honda City 2020, Compact
//
//2051 - (Honda 2020, Sedan), (Honda City 2020, Compact)
//2050 - Toyota, 2019, SUV