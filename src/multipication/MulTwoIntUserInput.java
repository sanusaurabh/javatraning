package multipication;

import java.util.Scanner;

public class MulTwoIntUserInput {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("enter 1st number =");
    int a =  scanner.nextInt();

    System.out.print("enter 2nd number =");
    int b = scanner.nextInt();

    int c = a * b;
    System.out.println("multiplying of two int number "+c);





    }
}
