package conditions;

import java.util.Scanner;

public class CheckNumberIsNegativeOrPositive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        int a = scan.nextInt();

        if(a < 0) {
            System.out.println("number is negative ");
        }
        if(a > 0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is 0");
        }
    }
}
