package com.shauryax.addition;

public class AddDoubleNumberTest {

    public static void main(String[] args) {

        AddDoubleNumber addDoubleNumber = new AddDoubleNumber();

        addDoubleNumber.addition();

        Double result1 = addDoubleNumber.additionAndReturnValue();
        System.out.println("addition and return value = " + result1);

        addDoubleNumber.additionByParameter(10.5, 20.5);

        Double result2 =
                addDoubleNumber.additionByParameterAndReturnValue(30.5, 40.5);

        System.out.println("parameter addition and return value = " + result2);
    }
}