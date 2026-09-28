package com.shauryax.Subtraction;

public class SubIntegerNumberTest {

    public static void main(String[] args) {

        SubIntegerNumber subIntegerNumber = new SubIntegerNumber();

        subIntegerNumber.subtraction();

        Integer result1 = subIntegerNumber.subtractionAndReturnValue();
        System.out.println("subtraction and return value = " + result1);

        subIntegerNumber.subtractionByParameter(20, 10);

        Integer result2 = subIntegerNumber.subtractionByParameterAndReturnValue(40, 15);
        System.out.println("parameter subtraction and return value = " + result2);
    }
}
