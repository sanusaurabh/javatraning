package division;

import java.util.Scanner;

public class DivisionUserInputNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int number1 = scan.nextInt();

        System.out.print("Enter 2nd number = ");
        int number2 = scan.nextInt();

        int division = number1 / number2 ;
        System.out.println("division of user input is "+ division);
    }
}
