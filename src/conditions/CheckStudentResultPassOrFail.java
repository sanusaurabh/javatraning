package conditions;

import java.util.Scanner;

public class CheckStudentResultPassOrFail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter marks: ");
        int marks = input.nextInt();

        boolean isPass = false;
        if(marks >= 40) {
            isPass = true;
        }

        if(isPass) {
            System.out.println("Studen is pass");
        }
        else {
            System.out.println("Student is fail");
        }
    }
}
