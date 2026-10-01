package division;

import java.util.Scanner;

public class DividedUsingTestClassMethod {
    public static void main(String[] args) {
        DividedUsingTestClassMethod method = new DividedUsingTestClassMethod();
        method.TestClass();
    }
    public void TestClass() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you first digits\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter you second Digit\t");
        float secondNumber = scan.nextFloat();

        float division = firstNumber / secondNumber;
        System.out.println("Division of the number is\t"+ division);
    }
}
