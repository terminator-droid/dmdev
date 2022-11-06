package com.dudev.multithreading.practice.tasks;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value " + removedValue + ". Size:" + list.size());
                } else {
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
                    int random = RandomUtil.getRandom();
                    System.out.println("consumer wait " + random);
                    list.notifyAll();
                    list.wait(RandomUtil.getRandom());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
