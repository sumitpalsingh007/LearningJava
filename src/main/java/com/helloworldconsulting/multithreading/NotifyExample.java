package com.helloworldconsulting.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class NotifyExample {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    queue.produce(i);
                    Thread.sleep(500); // Simulate time delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer1 = new Thread(() -> {
            try {
                while (true) queue.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer2 = new Thread(() -> {
            try {
                while (true) queue.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            System.out.println("Queue is full. Producer waiting...");
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value + " by thread: " + Thread.currentThread().getName());
        notify(); // Notify one waiting consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue is empty. Consumer waiting...");
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value + " by thread: " + Thread.currentThread().getName());
        notifyAll(); // Notify all waiting threads
    }
}