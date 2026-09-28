package com.shauryax.div;

import java.util.Scanner;

public class DivTwoDoubleUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fist number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 =
                sc.nextDouble();

        double div = num1 / num2;
        System.out.println("Div =" + div);

    }
}
