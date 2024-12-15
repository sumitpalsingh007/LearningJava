package com.helloworldconsulting.multithreading;

public class ThreadStateExamples {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());

        System.out.println("State: " + thread.getState()); // NEW

        thread.start(); // Start the thread
        System.out.println("State: " + thread.getState()); // RUNNABLE

        Thread.sleep(500);
        System.out.println("State: " + thread.getState()); // TIMED_WAITING

        thread.join(); // Wait for the thread to terminate
        System.out.println("State: " + thread.getState()); // TERMINATED
    }
}