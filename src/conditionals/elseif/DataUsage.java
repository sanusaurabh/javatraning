package conditionals.elseif;
/*Write a Java program using if-else-if to calculate the mobile data plan price based on data usage.
        Data:
        Up to 1 GB       — ₹100
        Above 1 to 3 GB  — ₹200
        Above 3 to 5 GB  — ₹300
        Above 5 GB       — ₹500
        If data is 0 or negative, print:
        Invalid data.*/


import java.util.Scanner;

public class DataUsage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data used: ");
        double data = sc.nextDouble();

        if (data <= 0) {
            System.out.println("Invalid data.");
        }
        else if (data <= 1) {
            System.out.println("Plan Price = ₹100");
        }
        else if (data <= 3) {
            System.out.println("Plan Price = ₹200");
        }
        else if (data <= 5) {
            System.out.println("Plan Price = ₹300");
        }
        else {
            System.out.println("Plan Price = ₹500");
        }
    }
}