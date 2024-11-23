package com.helloworldconsulting.fileprocessing.input;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"))) {
            int intValue = dis.readInt();      // Reads an integer
            double doubleValue = dis.readDouble(); // Reads a double
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}