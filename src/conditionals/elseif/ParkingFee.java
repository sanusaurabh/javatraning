package conditionals.elseif;
/* Write a Java program using if-else-if to calculate the parking fee based on hours.

        Hours:
        1 to 2 hours    — ₹20
        3 to 5 hours    — ₹50
        6 to 10 hours   — ₹100
        Above 10 hours  — ₹150

        If hours are 0 or negative, print:
        Invalid hours.*/


import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        if (hours <= 0) {
            System.out.println("Invalid hours.");
        }
        else if (hours <= 2) {
            System.out.println("Parking Fee = ₹20");
        }
        else if (hours <= 5) {
            System.out.println("Parking Fee = ₹50");
        }
        else if (hours <= 10) {
            System.out.println("Parking Fee = ₹100");
        }
        else {
            System.out.println("Parking Fee = ₹150");
        }
    }
}