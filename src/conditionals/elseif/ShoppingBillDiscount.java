package conditionals.elseif;

import java.util.Scanner;

/* Write a Java program using if-else-if to calculate the discount on a shopping bill.
Below ₹1,000       — No discount
₹1,000 to ₹4,999   — 10% discount
₹5,000 to ₹9,999   — 20% discount
₹10,000 or above   — 30% discount
If bill amount is 0 or negative, print:Invalid bill amount.*/
public class ShoppingBillDiscount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount");
        double billAmount = sc.nextDouble();

        if(billAmount < 1000){
            System.out.println("No Discount");
        }
        else if (billAmount >= 1000 && billAmount < 5000) {
            double discountedbill =  billAmount * 10 / 100;
            System.out.println("Your Discount is " + discountedbill);
        }
        else if (billAmount >= 5000 && billAmount < 10000) {
            double discountedbill =  billAmount * 20 / 100;
            System.out.println("Your Discount is " + discountedbill);
        }
        else if (billAmount >= 10000){
            double discountedbill =  billAmount * 30 / 100;
            System.out.println("Your Discount is " + discountedbill);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
