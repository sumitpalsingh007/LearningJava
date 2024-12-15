package com.helloworldconsulting.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CancelFutureTaskExample {
    public static void main(String[] args) {
        // Create a Callable task
        Callable<String> callableTask = () -> {
            Thread.sleep(5000); // Simulate long-running task
            return "Task Completed";
        };

        // Wrap it in a FutureTask
        FutureTask<String> futureTask = new FutureTask<>(callableTask);
        Thread thread = new Thread(futureTask);

        thread.start();

        try {
            Thread.sleep(2000); // Allow the task to run for 2 seconds
            System.out.println("Canceling the task...");
            futureTask.cancel(true); // Cancel the task
            if (futureTask.isCancelled()) {
                System.out.println("Task was cancelled.");
            } else {
                System.out.println("Result: " + futureTask.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}