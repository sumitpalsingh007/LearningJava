package com.helloworldconsulting.multithreading;

import java.util.concurrent.*;

public class SingleThreadExecutorWithFutureTask {
    public static void main(String[] args) {
        // Create a Single Thread Executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create Callable tasks
        Callable<String> callableTask = () -> {
            String threadName = Thread.currentThread().getName();
            return "Executed by: " + threadName;
        };

        // Wrap Callable in FutureTask
        FutureTask<String> futureTask1 = new FutureTask<>(callableTask);
        FutureTask<String> futureTask2 = new FutureTask<>(callableTask);

        // Submit tasks
        executor.submit(futureTask1);
        executor.submit(futureTask2);

        // Retrieve and display results
        try {
            System.out.println(futureTask1.get());
            System.out.println(futureTask2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
