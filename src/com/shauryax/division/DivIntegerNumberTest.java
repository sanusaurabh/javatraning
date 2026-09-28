package com.shauryax.division;

public class DivIntegerNumberTest
{

    public static void main(String[] args) {

        DivIntegerNumber divIntegerNumber = new DivIntegerNumber();

        divIntegerNumber.division();

        Integer result1 = divIntegerNumber.divisionAndReturnValue();
        System.out.println("division and return value = " + result1);

        divIntegerNumber.divisionByParameter(20, 5);

        Integer result2 = divIntegerNumber.divisionByParameterAndReturnValue(40, 8);
        System.out.println("parameter division and return value = " + result2);
    }
}