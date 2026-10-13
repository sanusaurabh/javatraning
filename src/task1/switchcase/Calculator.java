package task1.switchcase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter a number");
        int num2 = input.nextInt();
        System.out.println("Please enter an operator from +, -, *, /");
        String opertator = input.next();

        switch (opertator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid input");

        }


    }
}
