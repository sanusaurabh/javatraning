package conditions;

import java.util.Scanner;

public class FindMaximumBetweenThreeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        int a = scan.nextInt();

        System.out.println("enter 2nd number : ");
        int b = scan.nextInt();

        System.out.println("enter 3rd number : ");
        int c = scan.nextInt();

        if(a > b) {

            System.out.println("maximum value is " + a);
        }
        if(a < b){
            System.out.println("maximum value is "+ b);
        }
        else{
            System.out.println("maximum value is "+ c);
        }
    }
}
