package com.enset.controller;

import com.enset.domain.BankAccount;
import com.enset.service.BankAccountManagerInterfaceImpl;

import java.util.ArrayList;

public class BankChecker {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(111L,5000,"holder1");
        BankAccount bankAccount2 = new BankAccount(222L,200,"holder2");
        BankAccount bankAccount3 = new BankAccount(333L,10000,"holder3");
ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
bankAccounts.add(bankAccount);
bankAccounts.add(bankAccount2);
bankAccounts.add(bankAccount3);
bankAccounts.remove(bankAccount2);
        BankAccountManagerInterfaceImpl bankimp = new BankAccountManagerInterfaceImpl();

        bankimp.accountDeposit(bankAccount);


    }
}
