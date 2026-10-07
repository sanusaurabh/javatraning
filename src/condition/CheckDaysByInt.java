package condition;

import java.util.Scanner;

public class CheckDaysByInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter days between 1 to 7: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber == 1) {
            System.out.println("Monday First day of the week");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday Second day of the week");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday Third day of the week");
        } else if (dayNumber == 4) {
            System.out.println("Thursday Fourth day of the week");
        } else if (dayNumber == 5) {
            System.out.println("Friday Fifth day of the week");
        } else if (dayNumber == 6) {
            System.out.println("Saturday Sixth day of the week");
        } else if (dayNumber == 7) {
            System.out.println("Sunday Seventh day of the week");
        } else {
            System.out.println("Does not match with any days.");
        }
    }
}