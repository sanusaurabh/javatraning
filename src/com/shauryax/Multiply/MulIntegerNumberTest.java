package com.shauryax.Multiply;

import java.util.Scanner;

public class MulIntegerNumberTest {

    public static void main(String[] args) {

        MulIntegerNumber mulIntegerNumber = new MulIntegerNumber();

        mulIntegerNumber.multiplication();

        Integer result1 = mulIntegerNumber.multiplicationAndReturnValue();
        System.out.println("multiplication and return value = " + result1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("entry first number=");
       int numone = scanner.nextInt();
      System.out.println("enter 2nd number =");
      int numtwo = scanner.nextInt();
        mulIntegerNumber.multiplicationByParameter(10, 20);
        mulIntegerNumber.multiplicationByParameter(numone, numtwo);

        Integer result2 = mulIntegerNumber.multiplicationByParameterAndReturnValue(30, 40);
        System.out.println("parameter multiplication and return value = " + result2);

        Integer result3 = mulIntegerNumber.multiplicationByParameterAndReturnValue(numone,numtwo);
        System.out.println("parameter multiplication and return value = " + result3);
    }
}
