    package com.enset.controller;

    import com.enset.domain.BankAccount;
    import com.enset.exceptions.InsuficentMoneyException;
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
            System.out.println("Balance before methode "+bankAccount.getBalance());
            bankimp.accountDeposit(bankAccount,6000);
            System.out.println("Balance after methode "+bankAccount.getBalance());
            bankimp.balance(bankAccount3);
            try {
                bankimp.moneyTransfer(bankAccount2,bankAccount,500);
            } catch (InsuficentMoneyException e) {
                System.err.println("This is supposed to be an error message "+e.getMessage());
                System.err.println("This is also supposed to be an error message "+e.getInsuficientMoney());
            }
            try {
                bankimp.accountWithdrawal(bankAccount,999999999);
            } catch (InsuficentMoneyException e) {
                System.err.println("This is supposed to be an error message "+e.getMessage());
                System.err.println("This is also supposed to be an error message "+e.getInsuficientMoney());
            }


        }
    }
