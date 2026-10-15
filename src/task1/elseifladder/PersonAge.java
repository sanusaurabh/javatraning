package task1.elseifladder;

import java.util.Scanner;

//Check whether a person is a child (below 13), teenager (13–19), or adult (20+).
public class PersonAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age >= 0 && age < 13) {
            System.out.println("The person is a child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("The person is a teenager");
        }
        else if (age >= 20) {
            System.out.println("The person is an adult");
        }
        else {
            System.out.println("Your entered age is not valid");
        }

    }
}
