package conditionals.onlyif;

import java.util.Scanner;

public class GradeFromPercentage {
    public static void main(String[] args) {
 /* Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage - ");
        int percentage = input.nextInt();
        if(percentage >= 90){
            System.out.println("Your grade is A");
        }
        if(percentage >= 80){
            System.out.println("Your grade is B");
        }
        if(percentage >= 70){
            System.out.println("Your grade is C");
        }
        if(percentage >= 60){
            System.out.println("Your grade is D");
        }
        if(percentage >= 40){
            System.out.println("Your grade is E");
        }
        if(percentage < 40){
            System.out.println("Your grade is F and you are failed");
        }
    }
}
