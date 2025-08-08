package com.enset.service;

import com.enset.domain.BankAccount;
import com.enset.exceptions.InsuficentMoneyException;
import com.enset.exceptions.NonExistingAccountException;

public class BankAccountManagerInterfaceImpl implements BankAccountManagerInterface {
    @Override
    public void accountDeposit(BankAccount bankAccount, double amount) {
            bankAccount.setBalance(bankAccount.getBalance() + amount);
    }

    @Override
    public void accountWithdrawal(BankAccount bankAccount,double money) throws InsuficentMoneyException {
           if (bankAccount.getBalance() < money) {
               throw new InsuficentMoneyException("You dont have enough money to withdrawal in your bank account", money);
           }
            bankAccount.setBalance(bankAccount.getBalance() - money);
    }

    @Override
    public void balance(BankAccount bankAccount) {
        System.out.println( "Current balance "+bankAccount.getBalance());

    }

//    @Override
//    public void moneyTransfer(BankAccount bankAccount, BankAccount bankAccount2,double money) throws InsuficentMoneyException, NonExistingAccountException {
//        if (bankAccount2.getBalance() < money ) {
//
//            throw new InsuficentMoneyException("You dont have enough money to do this operation", money);
//
//        }else if (bankAccount2.getAccountNumber()!=bankAccount.getAccountNumber()) {
//            throw new NonExistingAccountException("Your Account does not exeisit ",bankAccount2.toString());
//        }
//        bankAccount.setBalance(bankAccount2.getBalance() - money);
//    }

    //Gemini logic below
@Override
public void moneyTransfer(BankAccount fromAccount, BankAccount toAccount, double amount) throws InsuficentMoneyException {
    // You would typically throw a NonExistentAccountException if 'toAccount' were null
    // which would happen if it wasn't found by an ID.
    // For this method signature, we'll assume the accounts exist.

    // 1. Withdraw from the source account. This handles the InsufficientFundsException for us.
    this.accountWithdrawal(fromAccount, amount);

    // 2. Deposit into the destination account.
    this.accountDeposit(toAccount, amount);

    System.out.println("Transfer of " + amount + " from " + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber() + " successful.");
}
}
