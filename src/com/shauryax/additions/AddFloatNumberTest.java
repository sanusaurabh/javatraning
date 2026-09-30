package com.shauryax.additions;

public class AddFloatNumberTest {

    public static void main(String[] args) {

        AddFloatNumber addFloatNumber = new AddFloatNumber();

        addFloatNumber.addition();

        Float result1 = addFloatNumber.additionAndReturnValue();
        System.out.println("addition and return value = " + result1);

        addFloatNumber.additionByParameter(10.5f, 20.5f);

        Float result2 = addFloatNumber.additionByParameterAndReturnValue(30.5f, 40.5f);
        System.out.println("parameter addition and return value = " + result2);
    }
}
