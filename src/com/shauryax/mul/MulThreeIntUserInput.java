package com.shauryax.mul;

import java.util.Scanner;

public class MulThreeIntUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int mul = a * b * c;

        System.out.println("Multiplication = " + mul);
    }
}
