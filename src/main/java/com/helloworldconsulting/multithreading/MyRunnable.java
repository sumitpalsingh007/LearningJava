package com.helloworldconsulting.multithreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("State: " + Thread.currentThread().getState()); // RUNNABLE
            Thread.sleep(1000); // Puts the thread into TIMED_WAITING state
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}