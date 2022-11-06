package com.dudev.multithreading.practice.scientists;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Dump implements Runnable{
    private static final int INITIAL_SEED = 20;
    private final BlockingQueue<Detail> detailsInDump = new ArrayBlockingQueue<>(INITIAL_SEED, true, DetailsUtil.getRandomDetails(INITIAL_SEED));

    @Override
    public void run() {
//        try {
//            while (true) {
//                synchronized (detailsInDump) {
//
//                }
//            }
//        }
    }
}
