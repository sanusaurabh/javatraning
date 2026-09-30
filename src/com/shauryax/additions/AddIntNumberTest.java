package com.shauryax.additions;

public class AddIntNumberTest {

    public static void main(String[] args) {

        AddIntNumber addIntNumber = new AddIntNumber();

        addIntNumber.addition();

        Integer result1 = addIntNumber.additionAndReturnValue();
        System.out.println("addition and return value = " + result1);

        addIntNumber.additionByParameter(10, 20);

        Integer result2 = addIntNumber.additionByParameterAndReturnValue(30, 40);
        System.out.println("parameter addition and return value = " + result2);
    }
}
