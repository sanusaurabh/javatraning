package modulusWithUserInput;

import java.util.Scanner;

public class modulusFloatUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number = ");
        float num2 = sc.nextFloat();
        float modulus = num1 % num2;
        System.out.println("The modulus is " + modulus);
    }
}
