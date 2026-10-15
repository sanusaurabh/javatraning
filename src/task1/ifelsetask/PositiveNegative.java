package task1.ifelsetask;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
