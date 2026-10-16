package elseifcondition;

import java.util.Scanner;

public class MummyMood {
    /* mummy's mood director */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100):");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("mummy is very happy, you will get a party");}
        else if (marks >= 70){
            System.out.println("mummy is happy, she will appreciate you");}
        else if(marks >= 50){
            System.out.println("mummy is normal, she will say nothing");}
        else if(marks >= 35){
            System.out.println("mummy is angry , you willbe scolded");}
        else{
            System.out.println("mummy is very angry, danger ahead");
        }
    }
}
