package com.example.day1;

public class ThreadDemoThread extends Thread {
    private final int threadId;
    public ThreadDemoThread(int threadId) {
        this.threadId=threadId;
    }
    public void run(){
        System.out.println("Running run method of thread "+ this.threadId);

       try {


           for (int i = 1; i < 10; i++) {
               System.out.println("iteration number  " + i + " of thread " + this.threadId);
               sleep(50);
           }
       }catch (InterruptedException ie) {
           System.out.println(ie.getMessage());
       }

    }


    public static void main(String[] args) {
        ThreadDemoThread thread1 = new ThreadDemoThread(1);
        thread1.start();
        ThreadDemoThread thread2 = new ThreadDemoThread(2);
        thread2.start();
        ThreadDemoThread thread3 = new ThreadDemoThread(3);
        thread3.start();
    }



}
