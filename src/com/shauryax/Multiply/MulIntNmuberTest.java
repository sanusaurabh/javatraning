package com.shauryax.Multiply;

public class MulIntNmuberTest {

    public static void main(String[] args) {

        MulIntNumber mulIntNumber = new MulIntNumber();

        mulIntNumber.multiplication();

        Integer result1 = mulIntNumber.multiplicationAndReturnValue();
        System.out.println("multiplication and return value = " + result1);

        mulIntNumber.multiplicationByParameter(10, 20);

        Integer result2 = mulIntNumber.multiplicationByParameterAndReturnValue(30, 40);
        System.out.println("parameter multiplication and return value = " + result2);
    }
}
