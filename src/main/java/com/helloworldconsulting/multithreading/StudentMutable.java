package com.helloworldconsulting.multithreading;

public class StudentMutable {
    private int age;
    private StringBuilder name;

    public StudentMutable(int age, StringBuilder name) {
        this.age = age;
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }
}
