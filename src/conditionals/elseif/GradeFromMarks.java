package conditionals.elseif;
/*Write a Java program using if-else-if statements to calculate the grade of a student based on their marks.
The grading rules are:
90 to 100 marks   — Grade A
80 to 89 marks    — Grade B
70 to 79 marks    — Grade C
60 to 69 marks    — Grade D
50 to 59 marks    — Grade E
Below 50 marks    — Grade F
If the user enters marks below 0 or above 100, print:
Invalid marks.
 */

import java.util.Scanner;

public class GradeFromMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks you would like to check");
        int marks = input.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Your grade is A ");
        }
        else if (marks >= 80 && marks < 90) {
            System.out.println("Your grade is B ");
        }
        else if (marks >= 70 && marks < 80) {
            System.out.println("Your grade is C ");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("Your grade is D ");
        }
        else if (marks >= 50 && marks < 60) {
            System.out.println("Your grade is E ");
        }
        else if (marks < 50) {
            System.out.println("Your grade is F ");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
