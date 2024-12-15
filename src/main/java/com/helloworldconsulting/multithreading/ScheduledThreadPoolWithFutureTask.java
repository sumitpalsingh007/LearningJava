package com.helloworldconsulting.multithreading;

import java.util.concurrent.*;

public class ScheduledThreadPoolWithFutureTask {
    public static void main(String[] args) {
        // Create a Scheduled Thread Pool with 2 threads
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Create Callable task
        Callable<String> callableTask = () -> {
            String threadName = Thread.currentThread().getName();
            return "Executed by: " + threadName + " at " + System.currentTimeMillis();
        };

        // Wrap Callable in FutureTask
        FutureTask<String> futureTask = new FutureTask<>(callableTask);

        // Schedule the task to run after a delay
        executor.schedule(futureTask, 1, TimeUnit.MINUTES);

        // Retrieve and display result
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
