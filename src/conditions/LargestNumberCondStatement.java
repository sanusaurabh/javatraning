package conditions;

import java.util.Scanner;

public class LargestNumberCondStatement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int x = scanner.nextInt();

        System.out.println("enter 2n number : ");
        int y = scanner.nextInt();

        System.out.println("enter 3rd number : ");
        int z = scanner.nextInt();

        if(x>y && x>z){

            System.out.println("X is the largest number");


        }
        else if(y>x && y>z){

            System.out.println("Y is the largest number");

        }
        else{

            System.out.println("Z is the largest number");
        }



    }
}
