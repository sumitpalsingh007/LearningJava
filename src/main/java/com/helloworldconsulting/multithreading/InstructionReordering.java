package com.helloworldconsulting.multithreading;

class InstructionReordering {
    private volatile int x = 0;
    private volatile boolean flag = false;

    public void writer() {
        x = 42;        // Step 1
        flag = true;   // Step 2 (volatile write)
    }

    public void reader() {
        if (flag) {    // Step 3 (volatile read)
            System.out.println("Value of x: " + x); // x will always be 42
        }
    }

    public static void main(String[] args) {
        InstructionReordering example = new InstructionReordering();

        Thread writerThread = new Thread(example::writer);
        Thread readerThread = new Thread(example::reader);

        writerThread.start();
        readerThread.start();
    }
}
