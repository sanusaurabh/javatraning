package conditions;

import java.util.Scanner;

public class CheckGetDiscountOrNot {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter bill:");
         int bill = input.nextInt();

         if(bill > 9999) {
             System.out.println("Get 20% discount");
         }
         else{
             System.out.println("No discount");
         }
    }
}
