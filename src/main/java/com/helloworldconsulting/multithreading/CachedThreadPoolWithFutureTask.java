package com.helloworldconsulting.multithreading;

import java.util.concurrent.*;

public class CachedThreadPoolWithFutureTask {
    public static void main(String[] args) {
        // Create a Cached Thread Pool
        ExecutorService executor = Executors.newCachedThreadPool();

        // Create Callable tasks and wrap them in FutureTasks
        FutureTask<String>[] futureTasks = new FutureTask[5];
        for (int i = 0; i < 5; i++) {
            int taskId = i + 1;
            Callable<String> callableTask = () -> {
                String threadName = Thread.currentThread().getName();
                return "Task " + taskId + " executed by: " + threadName;
            };

            futureTasks[i] = new FutureTask<>(callableTask);
            executor.submit(futureTasks[i]);
        }

        // Retrieve and display results
        for (FutureTask<String> futureTask : futureTasks) {
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

