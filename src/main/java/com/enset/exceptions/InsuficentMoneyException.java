package com.enset.exceptions;

public class InsuficentMoneyException extends Exception{
    private double insuficientMoney;

    //According to gemini i might need to store the current balance as well for better quality
    public InsuficentMoneyException(String message,double insuficientMoney) {
        super(message);
        this.insuficientMoney = insuficientMoney;

    }

    public double getInsuficientMoney() {
        return insuficientMoney;
    }
}
