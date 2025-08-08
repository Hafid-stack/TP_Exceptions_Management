package com.enset.controller;

import com.enset.domain.NaturalNumbers;
import com.enset.exceptions.NegativeNumberException;
import com.enset.service.NaturalNumbersImpl;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello World");
        NaturalNumbers naturalNumbers = new NaturalNumbers(5);
        System.out.println(naturalNumbers.getNumber());
        NaturalNumbers naturalNumbers2 = new NaturalNumbers();
        naturalNumbers2.setNumber(0);
        NaturalNumbersImpl naturalNumbersImpl = new NaturalNumbersImpl();
        try {
            naturalNumbersImpl.decrement(naturalNumbers2);
        } catch (NegativeNumberException e) {
            System.err.println("An error occurred " + e.getMessage());
            System.err.println("The value that caused the error was: " + e.getProblemValue());
        }
    }
}