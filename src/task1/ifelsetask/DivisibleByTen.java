package task1.ifelsetask;

import java.util.Scanner;
//Check whether a number is divisible by 10 or not.
public class DivisibleByTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if(number % 10 == 0)
        {
            System.out.println("The number is divisible by 10");
        }
        else
        {
            System.out.println("The number is not divisible by 10");
        }
    }
}
