package com.helloworldconsulting.fileprocessing.input;

import com.helloworldconsulting.fileprocessing.Person;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        Person p = new Person("ravi", 23);
        try (FileOutputStream fileOut = new FileOutputStream("person.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(p);
            System.out.println("Serialized data is saved in person.dat");
        } catch (IOException i) {
            i.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
