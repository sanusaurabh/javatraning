package conditionals;

import java.util.Scanner;

public class ValidTriangleBySides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of a triangle:");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side of a triangle:");
        int side2 = sc.nextInt();
        System.out.println("Enter the third side of a triangle:");
        int side3 = sc.nextInt();

        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("The triangle is Valid");
        }
        else {
            System.out.println("The triangle is not Valid");
        }
    }
}
