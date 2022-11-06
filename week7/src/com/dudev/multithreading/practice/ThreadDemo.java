package com.dudev.multithreading.practice;

public class ThreadDemo {
    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable());
        var lambdaThread = new Thread(() -> System.out.println("Helo from lambda" + Thread.currentThread().getName()));

        runnableThread.start();
        lambdaThread.start();
        simpleThread.start();
        try {
            simpleThread.join();
            lambdaThread.join();
            runnableThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());


    }
}
