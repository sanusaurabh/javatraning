package task1.elseifladder;
//Assign grades: 90+ = A, 75–89 = B, 50–74 = C, below 50 = Fail.
import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of a student");
        int grade = input.nextInt();

        if(grade >= 90){
            System.out.println("Your grade is A");
        }
        else if(grade >= 75 && grade < 90){
            System.out.println("Your grade is B");
        }
        else if(grade >= 50 && grade < 75){
            System.out.println("Your grade is C");
        }
        else if(grade >= 0 && grade < 50){
            System.out.println("You are fail");
        }
        else{
            System.out.println("Your entered number is not valid");
        }
    }
}
