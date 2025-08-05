package com.example.day2;

import static java.lang.Thread.sleep;

public class ThreadDemo implements Runnable {
    private int threadId;
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread " + this.threadId+ " iteration number "+i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public ThreadDemo(int threadId) {
        this.threadId = threadId;
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo1 = new ThreadDemo(1);
        Thread thread1 = new Thread(threadDemo1);
        ThreadDemo threadDemo2 = new ThreadDemo(2);
        Thread thread2 = new Thread(threadDemo2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
