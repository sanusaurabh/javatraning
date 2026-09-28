package com.shauryax.Multiply;

public class MulLongNumberTest {

    public static void main(String[] args) {

        MulLongNumber mulLongNumber = new MulLongNumber();

        mulLongNumber.multiplication();

        Long result1 = mulLongNumber.multiplicationAndReturnValue();
        System.out.println("multiplication and return value = " + result1);

        mulLongNumber.multiplicationByParameter(10L, 20L);

        Long result2 =
                mulLongNumber.multiplicationByParameterAndReturnValue(30L, 40L);

        System.out.println("parameter multiplication and return value = " + result2);
    }
}
