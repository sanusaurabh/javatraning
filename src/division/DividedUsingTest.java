package division;

import java.util.Scanner;

public class DividedUsingTest {
    public static void main(String[] args) {
        DividedUsingTest method = new DividedUsingTest();
        method.Test();
    }
    public void Test() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter you first digits\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter you second Digit\t");
        float secondNumber = scan.nextFloat();

        float division = firstNumber / secondNumber;
        System.out.println("Division of the number is\t"+ division);
    }
}
