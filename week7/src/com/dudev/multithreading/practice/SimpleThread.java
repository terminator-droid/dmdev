package com.dudev.multithreading.practice;

public class SimpleThread extends Thread{

    @Override
    public void run() {
        System.out.println(getName());

    }
}
