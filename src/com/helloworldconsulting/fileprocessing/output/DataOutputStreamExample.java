package com.helloworldconsulting.fileprocessing.output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data_output.dat"))) {
            dos.writeInt(42);      // Write an integer
            dos.writeDouble(3.14159); // Write a double
            System.out.println("Primitive data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}