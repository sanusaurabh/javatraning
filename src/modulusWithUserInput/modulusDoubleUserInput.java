package modulusWithUserInput;

import java.util.Scanner;

public class modulusDoubleUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double modulus  = num1 % num2;
        System.out.println("The modulus is " + modulus);

    }
}
