package condition;

import java.util.Scanner;

public class CheckGenderAndAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (gender == 'M') {

            if (age >= 10 && age <= 17) {
                System.out.println(name + " is Male Young");
            } else if (age >= 18 && age <= 50) {
                System.out.println(name + " is Male Adult");
            } else if (age >= 51 && age <= 90) {
                System.out.println(name + " is Male Old");
            }

        } else if (gender == 'F') {

            if (age >= 10 && age <= 17) {
                System.out.println(name + " is Female Young");
            } else if (age >= 18 && age <= 50) {
                System.out.println(name + " is Female Adult");
            } else if (age >= 51 && age <= 90) {
                System.out.println(name + " is Female Old");
            }

        } else {
            System.out.println("Invalid Gender");
        }
    }
}