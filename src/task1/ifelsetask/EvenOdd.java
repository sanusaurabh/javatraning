package task1.ifelsetask;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number =  input.nextInt();
        if(number % 2 == 0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
}
