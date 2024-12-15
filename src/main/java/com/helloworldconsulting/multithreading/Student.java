package com.helloworldconsulting.multithreading;

public final class Student {
    private final int age;
    private final StringBuilder name;

    public Student(int age, StringBuilder name) {
        this.age = age;
        this.name = name;
    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public int getAge() {
        return age;
    }
}
