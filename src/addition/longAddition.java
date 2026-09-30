package addition;

import java.util.Scanner;

public class longAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter the first number - ");
        float b = sc.nextFloat();
        System.out.println("Enter the second number - ");

        float addition = a + b;
        System.out.println("The sum is " + addition);

    }
}
