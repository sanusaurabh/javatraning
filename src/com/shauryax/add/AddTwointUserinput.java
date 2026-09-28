package com.shauryax.add;

import java.util.Scanner;

public class AddTwointUserinput {
    public static void main(String []args){
        Scanner scanner = new
                Scanner(System.in);

                  // user input 1st value
        System.out.print("enter 1st number =");
        //int x = 10;
        int x = scanner.nextInt();

        System.out.print("enter 2nd number =");
        // int y = 20;
        int y = scanner.nextInt();

        int z = x + y;


        System.out.println("sum = "+ z);
    }


}
