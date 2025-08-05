package com.example.day3;

public class Synchronization implements Runnable {
    //shared resource
    static int balance=2000;
    int amount;
    public int threadId;
    public Synchronization(int threadId, int amount) {
        this.amount = amount;
        this.threadId = threadId;
    }
    public static synchronized void decrementBalance(int amount, int threadId) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Thread " + threadId + " is decrementing. Balance before: " + balance);
            balance--;
            System.out.println("Thread " + threadId + " decremented. Balance after: " + balance);
        }
    }
    @Override
    public void run() {
        decrementBalance(amount, threadId);
    }


    public static void main(String[] args) {
        Synchronization deposit1 = new Synchronization(1, 50);
        Thread thread1 = new Thread(deposit1);
        thread1.start();
        Synchronization deposit2 = new Synchronization(2, 50);
        Thread thread2 = new Thread(deposit2);
        thread2.start();
        Synchronization deposit3 = new Synchronization(3,200);
        Thread thread3 = new Thread(deposit3);
        thread3.start();
        Synchronization deposit4 = new Synchronization(4,100);
        Thread thread4 = new Thread(deposit4);
        thread4.start();
        Synchronization deposit5 = new Synchronization(5,10);
        Thread thread5 = new Thread(deposit5);
        thread5.start();

        //total balance decremented =410
    }
}
