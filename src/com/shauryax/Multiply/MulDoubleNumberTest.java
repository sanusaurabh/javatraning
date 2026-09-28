package com.shauryax.Multiply;

public class MulDoubleNumberTest {

    public static void main(String[] args) {

        MulDoubleNumber mulDoubleNumber = new MulDoubleNumber();

        mulDoubleNumber.multiplication();

        Double result1 = mulDoubleNumber.multiplicationAndReturnValue();
        System.out.println("multiplication and return value = " + result1);

        mulDoubleNumber.multiplicationByParameter(10.5, 20.5);

        Double result2 =
                mulDoubleNumber.multiplicationByParameterAndReturnValue(30.5, 40.5);

        System.out.println("parameter multiplication and return value = " + result2);
    }
}
