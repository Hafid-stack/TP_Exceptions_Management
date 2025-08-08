package com.enset.service;

import com.enset.domain.BankAccount;
import com.enset.exceptions.InsuficentMoneyException;
import com.enset.exceptions.NonExistingAccountException;

public interface BankAccountManagerInterface {
    void accountDeposit(BankAccount bankAccount,double money ) ;
    void accountWithdrawal(BankAccount bankAccount,double money ) throws InsuficentMoneyException;
    void balance(BankAccount bankAccount);
    void moneyTransfer(BankAccount bankAccount, BankAccount bankAccount2,double money ) throws InsuficentMoneyException, NonExistingAccountException;
}
