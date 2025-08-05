package com.example.day5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HashMapExercise {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();


        for (int i = 0; i < 5; i++) {
           int taskNum=i;
           executorService.execute(() -> {
               String threadName=Thread.currentThread().getName();
               for (int j=0;j<5; j++){
                   String key="Key-"+(taskNum*5+j);
                   map.put(key, j);
                   System.out.println(threadName+"thread : key # "+key);
               }


           });


        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All threads completed. Main thread continues...");
        System.out.println("Printing values of hashmap");
        map.forEach((String key, Integer value) -> {
            System.out.println(key+": "+value);
        });
    }

}
