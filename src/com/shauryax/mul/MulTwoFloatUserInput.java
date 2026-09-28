package com.shauryax.mul;

import java.util.Scanner;

public class MulTwoFloatUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        float mul = a * b;

        System.out.println("Multiplication = " + mul);
    }
}
