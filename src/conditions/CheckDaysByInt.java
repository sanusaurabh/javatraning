package conditions;

import java.util.Scanner;

public class CheckDaysByInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter days name between 1 to 7: ");
        int dayNumber = input.nextInt();

        if(dayNumber == 1){
            System.out.println("first day of the week");
        }
        else if(dayNumber == 2){
            System.out.println("second day of the week");
        }
        else if(dayNumber == 3){
            System.out.println("third day of the week");
        }
        else if(dayNumber == 4){
            System.out.println("fourth day of the week");
        }
        else if(dayNumber == 5){
            System.out.println("fifth day of the week");
        }
        else if(dayNumber == 6){
            System.out.println("sixth day of the week");
        }
        else if(dayNumber == 7 ){
            System.out.println("seventh day of the week");
        }
        else{
            System.out.println("Does not match with any days.");
        }
    }
}
