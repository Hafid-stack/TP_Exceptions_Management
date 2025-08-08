package com.enset.domain;

public class BankAccount {
    private Long AccountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount() {
    }

    public BankAccount(Long accountNumber, double balance, String accountHolderName) {
        this.AccountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public Long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.AccountNumber = accountNumber;
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
                ", accountHolderName='" + accountHolderName + '\'' +
                '}';
    }
}
