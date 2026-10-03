package modulus;

import java.util.Scanner;

public class ModuloUserInput {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("enter 1st number = ");
    int asit = scanner.nextInt();

    System.out.print("enter 2nd number = ");
    int silu = scanner.nextInt();

    int anil = asit % silu;
    System.out.println("Value of modulo two integer "+anil);



    }
}
