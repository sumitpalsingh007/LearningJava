package com.helloworldconsulting.multithreading;

class SharedData {
    private volatile boolean running = true; // Volatile ensures visibility

    public void stop() {
        running = false; // Changes are immediately visible to other threads
    }

    public void doWork() {
        while (running) { // Reads updated value directly from main memory
            System.out.println("Working...");
        }
        System.out.println("Stopped.");
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedData sharedData = new SharedData();

        Thread workerThread = new Thread(sharedData::doWork);
        workerThread.start();

        Thread.sleep(1000);
        sharedData.stop(); // Request to stop the workerThread
    }
}