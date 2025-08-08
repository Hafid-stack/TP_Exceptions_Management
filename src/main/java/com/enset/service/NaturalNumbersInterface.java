package com.enset.service;

import com.enset.domain.NaturalNumbers;
import com.enset.exceptions.NegativeNumberException;

public interface NaturalNumbersInterface{

    void decrement(NaturalNumbers naturalNumbers) throws NegativeNumberException;
    void increment(NaturalNumbers naturalNumbers) ;

}
