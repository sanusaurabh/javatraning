package com.shauryax.division;

public class DivFloatNumberTest {

    public static void main(String[] args) {

        DivFloatNumber divFloatNumber = new DivFloatNumber();

        divFloatNumber.division();

        Float result1 = divFloatNumber.divisionAndReturnValue();
        System.out.println("division and return value = " + result1);

        divFloatNumber.divisionByParameter(20.5f, 5.5f);

        Float result2 =
                divFloatNumber.divisionByParameterAndReturnValue(40.5f, 8.5f);

        System.out.println("parameter division and return value = " + result2);
    }
}
