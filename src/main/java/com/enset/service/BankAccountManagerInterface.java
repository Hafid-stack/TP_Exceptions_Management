package com.enset.service;

import com.enset.domain.BankAccount;
import com.enset.exceptions.InsuficentMoneyException;
import com.enset.exceptions.NonExistingAccountException;

public interface BankAccountManagerInterface {
    void accountDeposit(BankAccount bankAccount );
    void accountWithdrawal(BankAccount bankAccount ) throws InsuficentMoneyException;
    void balance(BankAccount bankAccount);
    void moneyTransfer(BankAccount bankAccount, BankAccount bankAccount2 ) throws InsuficentMoneyException, NonExistingAccountException;
}
