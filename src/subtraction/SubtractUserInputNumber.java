package subtraction;

import java.util.Scanner;

public class SubtractUserInputNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int x = scan.nextInt();

        System.out.print("Enter 2nd number = ");
        int y = scan.nextInt();

        int subtraction = x - y ;
        System.out.println("subtraction of user input is "+ subtraction);
    }
}
