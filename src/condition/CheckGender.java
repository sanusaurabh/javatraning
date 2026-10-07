package condition;

import java.util.Scanner;

public class CheckGender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender (M/F/O): ");
        char gender = sc.next().toUpperCase().charAt(0);

        if (gender == 'M') {
            System.out.println(name + " is Male");
        } else if (gender == 'F') {
            System.out.println(name + " is Female");
        } else if (gender == 'O') {
            System.out.println(name + " is Other");
        } else {
            System.out.println("Invalid Gender");
        }
    }
}