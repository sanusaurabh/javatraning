package conditionals;

import java.util.Scanner;

public class NegativePositiveOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("This number is positive");
        }
        if(num < 0){
            System.out.println("This number is negative");
        }
        if(num == 0){
            System.out.println("This number is zero");
        }
    }
}
