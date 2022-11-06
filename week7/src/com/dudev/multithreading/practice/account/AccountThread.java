package com.dudev.multithreading.practice.account;

import java.util.concurrent.locks.ReentrantLock;

public class AccountThread extends Thread{

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try {
                if (accountFrom.takeOff(10)) {
                    accountTo.add(10);
                }
            } finally {
                accountTo.getLock().unlock();
                accountFrom.getLock().unlock();
            }

        }
    }

    private void lockAccounts() {
        while (true) {
            boolean accountFromIsLocked = accountFrom.getLock().tryLock();
            boolean accountToIsLocked = accountTo.getLock().tryLock();

            if (accountFromIsLocked && accountToIsLocked) {
                break;
            }
            if (accountFromIsLocked) {
                accountFrom.getLock().unlock();
            }
            if (accountToIsLocked) {
                accountTo.getLock().unlock();
            }
        }

    }
}
