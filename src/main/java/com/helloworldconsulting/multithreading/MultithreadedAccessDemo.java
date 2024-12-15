package com.helloworldconsulting.multithreading;

class MultithreadedAccessDemo {
    public static void main(String[] args) throws InterruptedException {
        StudentMutable student = new StudentMutable(20, new StringBuilder("John"));

        // Thread 1: Updates the student's age and name.
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                student.setAge(student.getAge() + 1);
                student.setName(new StringBuilder("John" + i));
                System.out.println(Thread.currentThread().getName() + " updated age to " + student.getAge() + " and name to " + student.getName());
            }
        });

        // Thread 2: Reads the student's age and name.
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                //System.out.println(Thread.currentThread().getName() + " read age as " + student.getAge() + " and name as " + student.getName());
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final name: " + student.getName());
        System.out.println("Final age: " + student.getAge());
    }
}