package subtraction1.withuserinput;

import java.util.Scanner;

public class FloatSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter thr first number(float): ");
        float num1 =  input.nextFloat();
        System.out.println("Enter thr second number(float): ");
        float num2 =  input.nextFloat();
        float subtraction = num1 - num2;

        System.out.println("The subtraction of two numbers = " + subtraction);
    }
}
