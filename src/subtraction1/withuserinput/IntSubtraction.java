package subtraction1.withuserinput;

import java.util.Scanner;

public class IntSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr first number(integer): ");
        int num1  = sc.nextInt();
        System.out.println("Enter thr second number(integer): ");
        int num2 = sc.nextInt();
        int subtraction = num1 - num2;
        System.out.println("The subtraction of two numbers = " + subtraction);
    }
}
