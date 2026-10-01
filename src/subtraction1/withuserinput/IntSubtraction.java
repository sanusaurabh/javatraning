package subtraction1.withuserinput;

import java.util.Scanner;

public class IntSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();
        int subtraction = num1 - num2;
        System.out.println("The subtraction of two numbers = " + subtraction);
    }
}
