package moduluswithuserInput;

import java.util.Scanner;

public class ModulusLongUserInput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        long num1 =  sc.nextLong();
        System.out.println("Enter the second number = ");
        long num2 =  sc.nextLong();
        long modulus = num1 % num2;

        System.out.println("The modulus is " + modulus);
    }
}
