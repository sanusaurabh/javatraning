package conditions;

import java.util.Scanner;

public class CheckSevenDaysWeek {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days in between 1 to 7");
        int dayNumber = scanner.nextInt();


        if(dayNumber == 1){

            System.out.println("Monday first day of the week");
        }
        else if(dayNumber == 2){

            System.out.println("Tuesday second day of the week");
        }
        else if(dayNumber == 3){
            System.out.println("Wednesday third day of the week");
        }
        else if(dayNumber == 4){
            System.out.println("Thursday fourth day of the week");
        }
        else if(dayNumber == 5){
            System.out.println("Friday fifth day of the week");
        }
        else if(dayNumber == 6){
            System.out.println("Saturday sixth day of the week");
        }
        else if(dayNumber == 7){
            System.out.println("Sunday seventh day of the week");
        }
        else{
            System.out.println("Doesn't match with any days");
        }
    }
}
