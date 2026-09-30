package com.shauryax.additions;

public class AddIntegerNumberTest {

    public static void main(String[] args){
     AddIntegerNumber addIntegerNumber = new AddIntegerNumber();
        addIntegerNumber .addition();
        int sum = addIntegerNumber .additionAndReturnValue();
        System.out.println("sum = "+sum);
        addIntegerNumber .additionByParameter(12,18);
        int total = addIntegerNumber .additionByParameterAndReturnValue(100,200);
        System.out.println("sum = "+sum);
    }
}