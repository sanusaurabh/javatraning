package conditionals.elseif;

/* Write a Java program using if-else-if to calculate the income tax based on annual income.

        Income:
        Below ₹2,50,000       — No tax
        ₹2,50,000 to ₹5,00,000 — 5% tax
        ₹5,00,001 to ₹10,00,000 — 20% tax
        Above ₹10,00,000       — 30% tax
         If income is 0 or negative, print:
        Invalid income. */


import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 0) {
            System.out.println("Invalid income.");
        }
        else if (income < 250000) {
            System.out.println("Tax = ₹0");
        }
        else if (income <= 500000) {
            tax = income * 0.05;
            System.out.println("Tax = ₹" + tax);
        }
        else if (income <= 1000000) {
            tax = income * 0.20;
            System.out.println("Tax = ₹" + tax);
        }
        else {
            tax = income * 0.30;
            System.out.println("Tax = ₹" + tax);
        }
    }
}