package conditionals.elseif;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter days between 1 to 7 : ");
            int day = sc.nextInt();

            if (day == 1) {
                System.out.println("Monday First day of the week");
            }
            else if (day == 2) {
                System.out.println("Tuesday Second day of the week");
            }
            else if (day == 3) {
                System.out.println("Wednesday Third day of the week");
            }
            else if (day == 4) {
                System.out.println("Thursday Fourth day of the week");
            }
            else if (day == 5) {
                System.out.println("Friday Fifth day of the week");
            }
            else if (day == 6) {
                System.out.println("Saturday Sixth day of the week");
            }
            else if (day == 7) {
                System.out.println("Sunday Seventh day of the week");
            }
            else {
                System.out.println("Does not match with any days.");
            }
        }
    }

