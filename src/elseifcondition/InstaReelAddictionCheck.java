package elseifcondition;

import java.util.Scanner;

public class InstaReelAddictionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many hours do you watch reels per day? ");
        int hours = sc.nextInt();

        if (hours < 1) {
            System.out.println("Controlled, good job");}
        else if (hours <= 2) {
            System.out.println("Normal");}
        else if (hours <= 4) {
            System.out.println("Addiction is starting");}
        else {
            System.out.println("Throw your phone away now");
        }
    }
}