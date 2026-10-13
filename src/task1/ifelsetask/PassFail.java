package task1.ifelsetask;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks =  input.nextInt();
        if(marks >= 0){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
