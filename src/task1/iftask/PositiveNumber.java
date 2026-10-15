package task1.iftask;

import java.util.Scanner;

//Check whether a number is positive
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Your entered number is Positive");
        }
    }
}
