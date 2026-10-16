package conditions;

import java.util.Scanner;

public class FindMaximumBetweenTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        int a = scanner.nextInt();

        System.out.println("enter 2nd number : ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("maximum value is "+ a);
        }
        else{
            System.out.println("maximum value is "+ b);
        }
    }
}
