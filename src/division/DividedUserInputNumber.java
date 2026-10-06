package division;

import java.util.Scanner;

public class DividedUserInputNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first integer number\t");
        float firstNumber = scan.nextFloat();
        System.out.print("Enter your second integer number\t");
        float secondNumber = scan.nextFloat();

        float division = firstNumber / secondNumber;
        System.out.println("Division of your input number is\t"+ division);
    }
}
