package com.dudev.multithreading.practice.semophore;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashboxes;

    public BuyerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            cashboxes.acquire();
            System.out.println(Thread.currentThread().getName() + " обслуживается на какой-то кассе ");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу ");

            cashboxes.release();
//            while (true) {
//                synchronized (cashboxes) {
//                    if (!cashboxes.isEmpty()) {
//                        Cashbox cashbox = cashboxes.remove();
//                        System.out.println(Thread.currentThread().getName() + " обслуживается на кассе " + cashbox);
//
//                        cashboxes.wait(5L);
//
//                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
//                        cashboxes.add(cashbox);
//                        break;
//                    } else {
//                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу ");
//                        cashboxes.wait();
//                    }
//                }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

