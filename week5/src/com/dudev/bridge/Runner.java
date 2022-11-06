package com.dudev.bridge;

public class Runner {
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn;
        n.setData("Hello");
        Integer x = (Integer)mn.data;
    }
}
