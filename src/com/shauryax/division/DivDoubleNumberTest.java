package com.shauryax.division;

public class DivDoubleNumberTest {

    public static void main(String[] args) {

        DivDoubleNumber divDoubleNumber = new DivDoubleNumber();

        divDoubleNumber.division();

        Double result1 = divDoubleNumber.divisionAndReturnValue();
        System.out.println("division and return value = " + result1);

        divDoubleNumber.divisionByParameter(20.5, 5.5);

        Double result2 =
                divDoubleNumber.divisionByParameterAndReturnValue(40.5, 8.5);

        System.out.println("parameter division and return value = " + result2);
    }
}