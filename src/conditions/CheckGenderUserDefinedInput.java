package conditions;

import java.util.Scanner;

public class CheckGenderUserDefinedInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scanner.next();

        System.out.println("Choose gender M or F or O");
        char gender = scanner.next().charAt(0);



        if(gender == 'M'){

            System.out.println(name+  " is a male");
        }
        if(gender == 'F'){

            System.out.println(name+ " is a feamle");
        }
        if(gender == 'O'){

            System.out.println(name+ " is a other");
        }
    }

}
