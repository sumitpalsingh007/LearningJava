package com.helloworldconsulting.multithreading;

class PrintNumbers implements Runnable {
    private int start;
    private int end;

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + i);
        }
    }
}