package com.helloworldconsulting.collections;

import java.util.HashSet;
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("John", 25));
        people.add(new Person("John", 25));

        System.out.println(people);
    }
}