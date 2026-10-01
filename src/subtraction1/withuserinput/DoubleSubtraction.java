package subtraction1.withuserinput;

import java.util.Scanner;

public class DoubleSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double subtraction = num1 - num2;

        System.out.println("The subtraction of two numbers = " + subtraction);
    }
}
