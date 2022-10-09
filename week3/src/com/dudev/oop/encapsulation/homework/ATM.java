package com.dudev.oop.encapsulation.homework;


public class ATM {
    private static final int TWENTY_NOMINAL = 20;
    private static final int FIFTY_NOMINAL = 50;
    private static final int HUNDRED_NOMINAL = 100;
    private int twenties;
    private int fifties;
    private int hundreds;

    public ATM(int twenties, int fifties, int hundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundreds = hundreds;
    }

    private static class Wrapper {
        public int value;
    }

    public void insertMoney(int twenties, int fifties, int hundreds) {
        this.twenties += twenties;
        this.fifties += fifties;
        this.hundreds += hundreds;
    }

    public boolean fetchMoney(int moneyAmount) {
        Wrapper moneyAmountCurrent = new Wrapper();
        moneyAmountCurrent.value = moneyAmount;
        if (moneyAmountCurrent.value > this.hundreds * HUNDRED_NOMINAL + this.fifties * FIFTY_NOMINAL + this.twenties * TWENTY_NOMINAL) {
            System.out.println("Недостаточно денег в банкомате");
            return false;
        }
        int hundredsToGive = fetchBanknotes(HUNDRED_NOMINAL, this.hundreds, moneyAmountCurrent);
        int fiftiesToGive = fetchBanknotes(FIFTY_NOMINAL, this.fifties, moneyAmountCurrent);
        int twentiesToGive = fetchBanknotes(TWENTY_NOMINAL, this.twenties, moneyAmountCurrent);

        if (moneyAmountCurrent.value != 0) {
            System.out.println("Выдача купюрами номиналом в 20, 50, 100 невозможна");
            return false;
        } else {
            this.hundreds -= hundredsToGive;
            this.fifties -= fiftiesToGive;
            this.twenties -= twentiesToGive;
            System.out.printf("Выдано %d %s номиналом 100, %d %s номиналом 50, %d %s номиналом 20%n", hundredsToGive, getFormattedWord(hundredsToGive), fiftiesToGive, getFormattedWord(fiftiesToGive), twentiesToGive, getFormattedWord(twentiesToGive));
            return true;
        }
    }

    private int fetchBanknotes(int banknoteNominal, int banknotesAvailable, Wrapper moneyAmountCurrent) {
        int banknotesToGive = 0;
        int banknotesNeeded = moneyAmountCurrent.value / banknoteNominal;
        if (banknotesNeeded != 0 && banknotesAvailable != 0) {
            banknotesToGive = Math.min(banknotesAvailable, banknotesNeeded);
            moneyAmountCurrent.value -= banknotesToGive * banknoteNominal;
        }
        return banknotesToGive;
    }

    public void printBalance() {
        System.out.printf("Баланс банкомата: %d%n", twenties * TWENTY_NOMINAL + fifties * FIFTY_NOMINAL + hundreds * HUNDRED_NOMINAL);
    }

    private String getFormattedWord(int value) {
        switch (value % 100) {
            case 11, 12, 13, 14 -> {
                return "купюр";
            }
        }
        switch (value % 10) {
            case 1 -> {
                return "купюра";
            }
            case 2, 3, 4 -> {
                return "купюры";
            }
            default -> {
                return "купюр";
            }
        }
    }
}
