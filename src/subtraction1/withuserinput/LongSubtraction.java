package subtraction1.withuserinput;

import java.util.Scanner;

public class LongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 =  sc.nextLong();
        long num2 = sc.nextLong();
        long subtraction = num1 - num2;

        System.out.println("The subtraction of two numbers = " + subtraction);
    }



}
