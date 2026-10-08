package conditionals.elseif;
/*

Write a Java program using if-else-if statements to calculate the electricity bill based on the units consumed.

The billing rules are:

0 to 100 units      — ₹2 per unit
101 to 200 units    — ₹3 per unit
201 to 300 units    — ₹5 per unit
Above 300 units     — ₹7 per unit

Input:
Enter the number of units consumed: 250

Output:
Electricity Bill = ₹1250

If the user enters a negative number of units, print:
Invalid units.*/

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units - ");
        int units = sc.nextInt();
        int bill;

        if(units <= 100){
            bill = units * 2;
            System.out.println("Your total bill amount is ₹" + bill);
        }
        else if (units <= 200) {
            bill = units * 3;
            System.out.println("Your total bill amount is ₹" + bill);
        }
        else if (units <= 300) {
            bill = units * 5;
            System.out.println("Your total bill amount is ₹" + bill);
        }
        else if (units > 300) {
            bill = units * 7;
            System.out.println("Your total bill amount is ₹" + bill);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
