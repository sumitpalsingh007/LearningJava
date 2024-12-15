package com.helloworldconsulting.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class VolatileAtomicity {
    //private volatile int count = 0;
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        //count++; // Not atomic: Read, Modify, Write
        count.incrementAndGet();
    }

    public int getCount() {
        //return count;
        return count.get();
    }

    public static void main(String[] args) {
        VolatileAtomicity example = new VolatileAtomicity();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count: " + example.getCount());
    }
}