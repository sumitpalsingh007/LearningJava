package com.helloworldconsulting.multithreading;

class VolatileExample {
    private volatile boolean running = true;

    public void stop() {
        running = false;
        System.out.println("Thread will stop soon...");
    }

    public void run() {
        System.out.println("Thread started...");
        while (running) {
            // not doing anything
        }
        System.out.println("Thread stopped.");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();

        Thread thread = new Thread(example::run);
        thread.start();

        Thread.sleep(1000);
        example.stop();
    }
}