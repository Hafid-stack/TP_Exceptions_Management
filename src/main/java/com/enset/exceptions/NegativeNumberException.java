package com.enset.exceptions;

public class NegativeNumberException extends Exception{
    private int problemValue;
    public NegativeNumberException(String message, int problemValue){
        super(message);
        this.problemValue = problemValue;

    }
    public int getProblemValue(){
        return problemValue;
    }
}
