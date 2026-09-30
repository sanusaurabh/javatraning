package modulusWithUserInput;

import java.util.Scanner;

public class modulusIntUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number = ");
        int num2 = sc.nextInt();

        int modulus = num1 % num2;

        System.out.println("The modulus of two numbers is - " + modulus);
    }
}
