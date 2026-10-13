package task1.iftask;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number > 100){
            System.out.println("This is a big number");
        }
    }
}
