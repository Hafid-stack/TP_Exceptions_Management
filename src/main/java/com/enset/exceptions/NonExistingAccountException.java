package com.enset.exceptions;

import com.enset.domain.BankAccount;

public class NonExistingAccountException extends Exception{
    private String account;

    //we might need to change the String to Long
    public NonExistingAccountException(String message,String account) {
        super(message);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
