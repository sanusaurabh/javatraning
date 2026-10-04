package conditions;

import java.util.Scanner;

public class ConditionalStatementGreaterNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        int a = scanner.nextInt();

        System.out.println("enter 2nd number : ");
        int b = scanner.nextInt();


        if(a>b){

            System.out.println("A is greater than B");

        }
        else{

            System.out.println("B is greater than A");
        }
    }

}
