package com.enset.domain;

public class BankAccount {
    private int AccountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance, String accountHolderName) {
        AccountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNumber=" + AccountNumber +
                ", balance=" + balance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
