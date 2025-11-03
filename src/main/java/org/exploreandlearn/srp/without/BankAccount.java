package org.exploreandlearn.srp.without;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void generateStatement() {
        System.out.println("Generating the statement with balance "+ balance);
    }
}
