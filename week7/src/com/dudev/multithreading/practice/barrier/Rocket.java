package com.dudev.multithreading.practice.barrier;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Ракета готовится к запуску");
            countDownLatch.await();
            System.out.println("Пуск");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
