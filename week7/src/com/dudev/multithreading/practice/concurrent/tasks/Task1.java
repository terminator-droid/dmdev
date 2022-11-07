package com.dudev.multithreading.practice.concurrent.tasks;

import com.dudev.multithreading.homework.util.ThreadUtil;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(22);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            Integer counter = threadLocal.get();
            threadLocal.set(counter == null ? 1 : ++counter);
            System.out.printf("Поток %s, задач %d%n", Thread.currentThread().getName(), threadLocal.get());
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            executorService.submit(() -> {
                Thread.sleep(seconds * 1000);
                System.out.printf("Поток %s спал %d секунд%n", Thread.currentThread().getName(), seconds);
                return seconds;
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);
    }
}
