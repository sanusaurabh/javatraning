package conditions;

import java.util.Scanner;

public class CheckMaleAndFemaleAgeUserInput {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name");
    String name = scanner.next();

    System.out.println("Enter gender M or F");
    char gender = scanner.next().charAt(0);

    System.out.println("Enter age between 10 to 90");
    int age = scanner.nextInt();

    if(gender == 'M'){

    if(age>=10 && age<=17){

        System.out.println(name+ " is a young male");

    }
    if(age>=18 && age<=50){

        System.out.println(name+ " is a adult male");

    }
        if(age>=51 && age<=90){

            System.out.println(name+ " is a old male");
        }
    }
    if(gender == 'F'){
        if(age>=10 && age<=17){

            System.out.println(name+ " is a young female");
        }

        if(age>=18 && age<=50){

            System.out.println(name+ " is a adult female");
        }
        if(age>=51 && age<=90){

            System.out.println(name+ " is a old female");
        }

    }


    }

}
