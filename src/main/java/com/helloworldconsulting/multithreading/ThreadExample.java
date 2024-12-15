package com.helloworldconsulting.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        //MyThread thread1 = new MyThread();
        //thread1.start(); // Start the thread
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Original Thread " + Thread.currentThread().getName() + " is running.");
    }
}
