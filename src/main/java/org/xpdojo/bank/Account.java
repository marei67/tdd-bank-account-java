package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        balance = this.balance - amount;
    }
}
