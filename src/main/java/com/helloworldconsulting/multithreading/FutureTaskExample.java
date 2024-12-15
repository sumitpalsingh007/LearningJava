package com.helloworldconsulting.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) {
        // Step 1: Create a Callable
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task is running...");
            Thread.sleep(2000); // Simulate long computation
            return 42; // Return result
        };

        // Step 2: Wrap Callable in FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);

        // Step 3: Run FutureTask in a thread
        Thread thread = new Thread(futureTask);
        thread.start();

        // Step 4: Retrieve the result
        try {
            System.out.println("Waiting for the result...");
            Integer result = futureTask.get(); // Blocks until task is complete
            System.out.println("Result from Callable: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}