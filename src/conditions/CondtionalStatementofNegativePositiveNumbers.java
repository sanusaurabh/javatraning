package conditions;

import java.util.Scanner;

public class CondtionalStatementofNegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number : ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("The number is positive");

        }
        else{

            System.out.println("The number is negative");

        }

    }
}