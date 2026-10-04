package conditions;

import java.util.Scanner;

public class CondtionalStatementIntUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        int num1 = scanner.nextInt();

        System.out.println("enter 2nd numbrer : ");
        int num2 = scanner.nextInt();
        if(num2 == 0){
            System.out.println("number can't divide by zero");

        }
        else{
        int num3 = num1 / num2;
        System.out.println("final value after divide "+num3);
        }

    }
}
