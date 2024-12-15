package com.helloworldconsulting.multithreading;

public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers(1, 5), "Thread-1");
        Thread thread2 = new Thread(new PrintNumbers(6, 10), "Thread-2");

        thread1.start(); // Start Thread-1
        thread2.start(); // Start Thread-2
    }
}