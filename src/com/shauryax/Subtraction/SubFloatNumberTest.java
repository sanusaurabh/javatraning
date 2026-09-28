package com.shauryax.Subtraction;

public class SubFloatNumberTest {

    public static void main(String[] args) {

        SubFloatNumber subFloatNumber = new SubFloatNumber();

        subFloatNumber.subtraction();

        Float result1 = subFloatNumber.subtractionAndReturnValue();
        System.out.println("subtraction and return value = " + result1);

        subFloatNumber.subtractionByParameter(20.5f, 10.5f);

        Float result2 =
                subFloatNumber.subtractionByParameterAndReturnValue(40.5f, 15.5f);

        System.out.println("parameter subtraction and return value = " + result2);
    }
}