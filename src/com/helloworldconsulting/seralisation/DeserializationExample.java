package com.helloworldconsulting.seralisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;

        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            employee = (Employee) in.readObject();
            System.out.println("Deserialized Employee:");
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
