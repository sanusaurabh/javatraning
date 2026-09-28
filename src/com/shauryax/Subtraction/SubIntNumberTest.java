package com.shauryax.Subtraction;

public class SubIntNumberTest {

    public static void main(String[] args) {

        SubIntNumber subIntNumber = new SubIntNumber();

        subIntNumber.subtraction();

        Integer result1 = subIntNumber.subtractionAndReturnValue();
        System.out.println("subtraction and return value = " + result1);

        subIntNumber.subtractionByParameter(20, 10);

        Integer result2 = subIntNumber.subtractionByParameterAndReturnValue(40, 15);
        System.out.println("parameter subtraction and return value = " + result2);
    }
}
