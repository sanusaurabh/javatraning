package com.shauryax.Subtraction;

public class SubDoubleNumberTest {

    public static void main(String[] args) {

        SubDoubleNumber subDoubleNumber = new SubDoubleNumber();

        subDoubleNumber.subtraction();

        Double result1 = subDoubleNumber.subtractionAndReturnValue();
        System.out.println("subtraction and return value = " + result1);

        subDoubleNumber.subtractionByParameter(20.5, 10.5);

        Double result2 =
                subDoubleNumber.subtractionByParameterAndReturnValue(40.5, 15.5);

        System.out.println("parameter subtraction and return value = " + result2);
    }
}
