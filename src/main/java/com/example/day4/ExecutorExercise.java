package com.example.day4;

import java.util.concurrent.*;

public class ExecutorExercise {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {

            Callable<String> callable = () -> {
                String threadName = Thread.currentThread().getName();
                for (int j = 0; j < 5; j++) {
                    System.out.println(threadName + " " + j);
                }
                return threadName + " completed the task";
            };

            Future<String> future = executorService.submit(callable);

            try {
                String futureName = future.get();
                System.out.println("Result: " + futureName);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}