package conditionals;

import java.util.Scanner;

public class WeekDayWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the day of the week between 1 to 7 - ");
        int day = sc.nextInt();

        if(day == 1){
            System.out.println("The day of the week is Sunday");
        }
        if(day == 2){
            System.out.println("The day of the week is Monday");
        }
        if(day == 3){
            System.out.println("The day of the week is Tuesday");
        }
        if(day == 4){
            System.out.println("The day of the week is Wednesday");
        }
        if(day == 5){
            System.out.println("The day of the week is Thursday");
        }
        if(day == 6){
            System.out.println("The day of the week is Friday");
        }
        if(day == 7){
            System.out.println("The day of the week is Saturday");
        }

    }
}
