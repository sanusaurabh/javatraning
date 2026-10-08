package conditionals.elseif;

import java.util.Scanner;

/*Write a Java program using if-else-if to determine the ticket price based on age.Age:
Below 5 years     — Free
5 to 12 years     — ₹50
13 to 59 years    — ₹100
60 years or above — ₹70 If age is negative, print:Invalid age.*/
public class TicketAccordingToAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double age = sc.nextDouble();
        if(age > 0 &&  age < 5){
            System.out.println("Your ticket is completely free");
        }
        else if(age > 5 && age < 12){
            System.out.println("Your ticket is 50₹");
        }
        else if(age > 12 && age < 60){
            System.out.println("Your ticket is 100₹");
        }
        else if(age > 60){
            System.out.println("Your ticket is of 70₹");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
