package com.helloworldconsulting.generics;

import java.util.List;
import java.util.Arrays;

public class BoundedWildcardExample {
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        System.out.println("Sum of intList: " + sumList(intList));
        System.out.println("Sum of doubleList: " + sumList(doubleList));
    }
}
