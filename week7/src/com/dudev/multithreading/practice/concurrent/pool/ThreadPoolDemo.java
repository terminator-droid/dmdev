package com.dudev.multithreading.practice.concurrent.pool;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(9);
//        Executors.newScheduledThreadPool(2);
//        Executors.newWorkStealingPool()

        Future<Integer> threadPool = executorService.submit(() -> {
            System.out.println("it's callable");
            return 1;
        });
        Map<Integer, Integer> integerIntegerMap = Collections.synchronizedMap(new HashMap<Integer, Integer>());
        executorService.shutdown();
        boolean b = executorService.awaitTermination(1L, TimeUnit.DAYS);
//        CopyOnWriteArrayList<>;
    }
}
