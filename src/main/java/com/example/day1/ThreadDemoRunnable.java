package com.example.day1;

import static java.lang.Thread.sleep;

public class ThreadDemoRunnable implements Runnable {
    String threadName;
    public ThreadDemoRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Initializing thread.");
    }
    public void run() {
        System.out.println("Running thread."+this.threadName);

        try{
            for (int i=5; i>0;i--) {
                System.out.println("printing thread "+this.threadName+ "  "+i);
                sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted."+ this.threadName);
        }
        System.out.println("Exiting thread "+this.threadName);
    }

    public static void main(String[] args) {
        ThreadDemoRunnable thread1 = new ThreadDemoRunnable("Thread1");
        Thread t1 = new Thread(thread1);
        t1.start();
        ThreadDemoRunnable thread2 = new ThreadDemoRunnable("Thread2");
        Thread t2 = new Thread(thread2);
        t2.start();
    }


}
