package conditions;

import java.util.Scanner;

public class VotingAgeConditionalStatement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age : ");
        int age = scanner.nextInt();

        if(age>=18){

            System.out.println("Eligible for voting");

        }
        else{
            System.out.println("Not eligible for voting");
        }


    }
}
