package helloworldconsulting.collections;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int standard;
    private String rollNo;

    public Student(String name, int age, int standard, String rollNo) {
        this.name = name;
        this.age = age;
        this.standard = standard;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return standard == student.standard
                && Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(standard, rollNo.hashCode(), name, age);
    }
}
