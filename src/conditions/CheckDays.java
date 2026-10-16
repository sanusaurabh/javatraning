package conditions;

import java.util.Scanner;

public class CheckDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter days name between monday to sunday: ");
        String dayName = input.next();

        if(dayName.equals("monday")){
            System.out.println("first day of the week");
        }
        else if(dayName.equals("tuesday")){
            System.out.println("second day of the week");
        }
        else if(dayName.equals("wednesday")){
            System.out.println("third day of the week");
        }
        else if(dayName.equals("thursday")){
            System.out.println("fourth day of the week");
        }
        else if(dayName.equals("friday")){
            System.out.println("fifth day of the week");
        }
        else if(dayName.equals("saturday")){
            System.out.println("sixth day of the week");
        }
        else if(dayName.equals("sunday")){
            System.out.println("seventh day of the week");
        }
        else{
            System.out.println("Does not match with any days.");
        }
    }
}
