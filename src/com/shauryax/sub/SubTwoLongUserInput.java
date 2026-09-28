package com.shauryax.sub;

import java.util.Scanner;

public class SubTwoLongUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long num1 = sc.nextLong();

        System.out.print("Enter second number: ");
        long num2 = sc.nextLong();

        long sub = num1 - num2;

        System.out.println("Sub = " + sub);
    }
}
