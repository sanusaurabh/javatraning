package division;

import java.util.Scanner;

public class DivisionUserInputNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int x = scan.nextInt();

        System.out.print("Enter 2nd number = ");
        int y = scan.nextInt();

        int Division = x / y ;
        System.out.println("division of user input is "+ Division);
    }
}
