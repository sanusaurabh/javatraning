package task1.elseifladder;

import java.util.Scanner;

//Create a calculator that performs addition, subtraction, multiplication, or division based on an operator.
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the sign of the operation you want to perform from +, -, *, /  = ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println(num1 + num2 + " is your answer.");
        }
        else if (operator.equals("-")) {
            System.out.println(num1 - num2 + " is your answer.");
        }
        else if (operator.equals("*")) {
            System.out.println(num1 * num2 + " is your answer.");
        }
        else if (operator.equals("/")) {
            System.out.println(num1 / num2 + " is your answer.");
        }
        else {
            System.out.println("Please enter valid credentials");
        }
    }
}
