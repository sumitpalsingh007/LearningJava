package com.helloworldconsulting.fileprocessing.output;


import com.helloworldconsulting.fileprocessing.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person_output.dat"))) {
            oos.writeObject(person);
            System.out.println("Object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}