package conditionals.elseif;

import java.util.Scanner;

public class ShipingCharge {
   /* Q6. Write a Java program using if-else-if to determine the shipping charge based on the order amount.
     Below ₹500       — ₹100 shipping
    ₹500 to ₹999     — ₹50 shipping
    ₹1000 to ₹1999   — ₹20 shipping
    ₹2000 or above   — Free shipping
 If amount is 0 or negative, print:Invalid amount.
*/
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else if (amount < 500) {
            System.out.println("Shipping Charge = ₹100");
        }
        else if (amount < 1000) {
            System.out.println("Shipping Charge = ₹50");
        }
        else if (amount < 2000) {
            System.out.println("Shipping Charge = ₹20");
        }
        else {
            System.out.println("Shipping Charge = Free");
        }
    }
    }

