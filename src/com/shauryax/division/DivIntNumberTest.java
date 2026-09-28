package com.shauryax.division;

public class DivIntNumberTest {

    public static void main(String[] args) {

        DivIntNumber divIntNumber = new DivIntNumber();

        divIntNumber.division();

        Integer result1 = divIntNumber.divisionAndReturnValue();
        System.out.println("division and return value = " + result1);

        divIntNumber.divisionByParameter(20, 5);

        Integer result2 = divIntNumber.divisionByParameterAndReturnValue(40, 8);
        System.out.println("parameter division and return value = " + result2);
    }
}