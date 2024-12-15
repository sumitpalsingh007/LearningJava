package com.helloworldconsulting.multithreading;

public class WaitExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        consumer.start();
        producer.start();
    }
}

class SharedResource {
    private boolean dataReady = false;

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producing data...");
        Thread.sleep(1000); // Simulate data preparation
        dataReady = true;
        System.out.println("Data produced. Notifying...");
        notify(); // Notify a waiting thread
    }

    public synchronized void consume() throws InterruptedException {
        while (!dataReady) {
            System.out.println("Waiting for data...");
            wait(); // Wait until notified
        }
        System.out.println("Data consumed.");
    }
}
