package com.enset.service;

import com.enset.domain.NaturalNumbers;
import com.enset.exceptions.NegativeNumberException;

public class NaturalNumbersImpl implements NaturalNumbersInterface {


    @Override
    public void decrement(NaturalNumbers naturalNumbers) throws NegativeNumberException {
             int newValue=naturalNumbers.getNumber()-1;
                   if(newValue<0){
                           throw new NegativeNumberException("Cannot decrement the number zero.", newValue);
                      }
             naturalNumbers.setNumber(newValue);

    }

    @Override
    public void increment(NaturalNumbers naturalNumbers) {
            int newValue=naturalNumbers.getNumber()+1;
            naturalNumbers.setNumber(newValue);
    }
}
