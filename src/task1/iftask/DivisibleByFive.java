package task1.iftask;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num =  input.nextInt();

        if(num % 5 == 0){
            System.out.println("Your entered number is divisible by 5");
        }
    }
}
