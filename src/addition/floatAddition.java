package addition;

import java.util.Scanner;

public class floatAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number - ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number - ");
        float b = sc.nextFloat();
        float addition = a + b;
        System.out.println("The sum is " + addition);
    }
}
