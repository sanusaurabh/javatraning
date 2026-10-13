package task1.elseifladder;

import java.util.Scanner;
//Print whether a number is positive, negative, or zero.
public class NegativePositiveOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num < 0)
        {
            System.out.println("Your number is negative");
        }
        else if(num > 0)
        {
            System.out.println("Your number is positive");
        }
        else
        {
            System.out.println("Your number is zero");
        }
    }
}
