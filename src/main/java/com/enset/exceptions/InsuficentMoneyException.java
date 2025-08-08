package com.enset.exceptions;

public class InsuficentMoneyException extends Exception{
    private double insuficientMoney;
    public InsuficentMoneyException(String message,double insuficientMoney) {
        super(message);
        this.insuficientMoney = insuficientMoney;

    }

    public double getInsuficientMoney() {
        return insuficientMoney;
    }
}
