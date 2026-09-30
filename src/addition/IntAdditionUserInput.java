package addition;

import java.util.Scanner;

public class IntAdditionUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int c = a + b;

        System.out.println("Addition Result: " + c);

        scanner.close();
    }
}
