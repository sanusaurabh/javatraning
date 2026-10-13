package task1.iftask;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible");
        }
        if (age >= 18) {
            System.out.println("You are eligible");
        }
    }
}
