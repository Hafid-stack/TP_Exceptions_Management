package com.enset.service;

import com.enset.domain.BankAccount;
import com.enset.exceptions.InsuficentMoneyException;
import com.enset.exceptions.NonExistingAccountException;

public class BankAccountManagerInterfaceImpl implements BankAccountManagerInterface {
    @Override
    public void accountDeposit(BankAccount bankAccount) {

    }

    @Override
    public void accountWithdrawal(BankAccount bankAccount) throws InsuficentMoneyException {

    }

    @Override
    public void balance(BankAccount bankAccount) {

    }

    @Override
    public void moneyTransfer(BankAccount bankAccount, BankAccount bankAccount2) throws InsuficentMoneyException, NonExistingAccountException {

    }
}
