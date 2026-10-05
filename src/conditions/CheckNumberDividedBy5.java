package conditions;

import java.util.Scanner;

public class CheckNumberDividedBy5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number  : ");
        int num = scan.nextInt();
        if(num%5==0)
            System.out.println("This Number is Divisible by 5 ");
        else
            System.out.println("This Number is Not Divisible by 5 ");
    }
}
