package conditions;

import java.util.Scanner;

public class CheckDays {
    public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter days between Monday to Sunday: ");
        String dayName = scanner.next();


        // difference between == and equals  and equalAndignorcase
//        if(dayName == "Monday"){
//            System.out.println("Fist day of the week");
//        }
//        if(dayName.equalsIgnoreCase("Monday")){
//            System.out.println("Fist day of the week");
//        }

        if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("First Day of the Week");

        }
        else if(dayName.equals("Tuesday")){
            System.out.println("Second Day of the Week");
        }
        else if (dayName.equals("Wednesday")){

            System.out.println("third day of the week");
        }
        else if(dayName.equals("Thursday")){

            System.out.println("Forth day of the week");
        }
        else if(dayName.equals("Friday")){

            System.out.println("Fifth day of the week");
        }
        else if(dayName.equals("Saturday")){

            System.out.println("Sixth day of the week");
        }
        else if(dayName.equals("sunday")){

            System.out.println("Seventh day of the week");
        }
        else{

            System.out.println("Doesn't  match with any days");
        }
    }
}
