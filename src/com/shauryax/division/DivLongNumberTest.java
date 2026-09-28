package com.shauryax.division;

public class DivLongNumberTest {

    public static void main(String[] args) {

        DivLongNumber divLongNumber = new DivLongNumber();

        divLongNumber.division();

        Long result1 = divLongNumber.divisionAndReturnValue();
        System.out.println("division and return value = " + result1);

        divLongNumber.divisionByParameter(20L, 5L);

        Long result2 =
                divLongNumber.divisionByParameterAndReturnValue(40L, 8L);

        System.out.println("parameter division and return value = " + result2);
    }
}
