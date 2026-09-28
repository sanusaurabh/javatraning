package com.shauryax.Subtraction;

public class SubLongNumberTest {

    public static void main(String[] args) {

        SubLongNumber subLongNumber = new SubLongNumber();

        subLongNumber.subtraction();

        Long result1 = subLongNumber.subtractionAndReturnValue();
        System.out.println("subtraction and return value = " + result1);

        subLongNumber.subtractionByParameter(20L, 10L);

        Long result2 =
                subLongNumber.subtractionByParameterAndReturnValue(40L, 15L);

        System.out.println("parameter subtraction and return value = " + result2);
    }
}
