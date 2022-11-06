package com.dudev.multithreading.practice.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " обслуживается на кассе " + cashbox);
            Thread.sleep(5L);
            cashboxes.add(cashbox);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
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

