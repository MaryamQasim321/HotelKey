package com.example.day5;

import java.util.concurrent.CountDownLatch;

public class Countdown {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDown = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println("running thread number: " + Thread.currentThread().getId());
                countDown.countDown(); // Reduce count by 1
            }).start();
        }

        countDown.await(); // Wait until count reaches 0
        System.out.println("All threads completed. Main thread continues...");
    }
}
