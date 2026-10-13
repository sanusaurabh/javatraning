package task1.ifelsetask;

import java.util.Scanner;

//Check whether a person is eligible to vote.
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age  = sc.nextInt();
        if(age < 18){
            System.out.println("You are not eligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}
