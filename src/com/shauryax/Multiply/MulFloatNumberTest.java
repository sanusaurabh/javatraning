package com.shauryax.Multiply;

public class MulFloatNumberTest {

    public static void main(String[] args) {

        MulFloatNumber mulFloatNumber = new MulFloatNumber();

        mulFloatNumber.multiplication();

        Float result1 = mulFloatNumber.multiplicationAndReturnValue();
        System.out.println("multiplication and return value = " + result1);

        mulFloatNumber.multiplicationByParameter(10.5f, 20.5f);

        Float result2 =
                mulFloatNumber.multiplicationByParameterAndReturnValue(30.5f, 40.5f);

        System.out.println("parameter multiplication and return value = " + result2);
    }
}