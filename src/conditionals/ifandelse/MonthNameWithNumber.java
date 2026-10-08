package conditionals.onlyif;

import java.util.Scanner;

public class MonthNameWithNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the month number from 1 to 12 - ");
        int month = sc.nextInt();

        if(month == 1){
            System.out.println("The month is January");
        }
        if(month == 2){
            System.out.println("The month is February");
        }
        if(month == 3){
            System.out.println("The month is March");
        }
        if(month == 4){
            System.out.println("The month is April");
        }
        if(month == 5){
            System.out.println("The month is May");
        }
        if(month == 6){
            System.out.println("The month is June");
        }
        if(month == 7){
            System.out.println("The month is July");
        }
        if(month == 8){
            System.out.println("The month is August");
        }
        if(month == 9){
            System.out.println("The month is September");
        }
        if(month == 10){
            System.out.println("The month is October");
        }
        if(month == 11){
            System.out.println("The month is November");
        }
        if(month == 12){
            System.out.println("The month is December");
        }
    }
}
