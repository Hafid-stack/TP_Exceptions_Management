package com.enset.domain;

public class NaturalNumbers {
    private int number;

    public NaturalNumbers() {
    }

    public NaturalNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NaturalNumbers{" +
                "number=" + number +
                '}';
    }
}
