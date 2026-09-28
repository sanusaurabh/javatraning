package com.shauryax.div;

import java.util.Scanner;

public class DivTwoFloatUserInput {

    public static void main(String[] args){

        Scanner scanner =
                new Scanner(System.in);
        System.out.print("enter 1st number =");
        float x = scanner.nextFloat();

        System.out.print("enter 2nd number = ");
        float y = scanner .nextFloat();
        float z = x / y;

        System.out.println("div = " + z);
    }
}
