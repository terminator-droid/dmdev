package com.dudev.oop.encapsulation.homework;

public class ATMRunner {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 2, 0);
        atm.printBalance();
        atm.fetchMoney(14);
        atm.printBalance();
        atm.insertMoney(100, 101, 10);
        atm.printBalance();
        atm.fetchMoney(6140);
        atm.printBalance();
    }
}
