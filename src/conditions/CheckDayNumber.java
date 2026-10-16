package conditions;

import java.util.Scanner;

public class CheckDayNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter days between 1 to 7: ");
        String dayNumber = input.next();

        if(dayNumber.equals("1")){
            System.out.println("first day of the week");
        }
        else if(dayNumber.equals("2")){
            System.out.println("second day of the week");
        }
        else if(dayNumber.equals("3")){
            System.out.println("third day of the week");
        }
        else if(dayNumber.equals("4")){
            System.out.println("fourth day of the week");
        }
        else if(dayNumber.equals("5")){
            System.out.println("fifth day of the week");
        }
        else if(dayNumber.equals("6")){
            System.out.println("sixth day of the week");
        }
        else if(dayNumber.equals("7")){
            System.out.println("seventh day of the week");
        }
        else{
            System.out.println("Does not match with any days.");
        }
    }
}
