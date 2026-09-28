package com.shauryax.addition;

public class AddLongNumberTest {

    public static void main(String[] args) {

        AddLongNumber addLongNumber = new AddLongNumber();

        Long result1 =
                addLongNumber.additionByParameterAndReturnValue(10L, 20L);

        System.out.println(result1);

        Long result2 =
                addLongNumber.additionAndReturnValue();

        System.out.println(result2);

        addLongNumber.additionByParameter(30L, 40L);
    }
}