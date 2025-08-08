package com.enset.exceptions;

import com.enset.domain.BankAccount;

public class NonExistingAccountException extends Exception{
    private BankAccount account;
    public NonExistingAccountException(String message,BankAccount account) {
        super(message);
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }
}
