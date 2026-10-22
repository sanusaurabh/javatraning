package loopPractice;

/* mini student management loop */

import java.util.Scanner;

public class MiniStudentManagementLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        int max = 0;

        for(int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of student" + (i+1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[1];
            if(marks[i] > max){
                max = marks[1];
            }
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total/5));
        System.out.println("Topper marks: " + max);

        System.out.print("All marks: ");
        for(int m : marks) {
            System.out.print(m + " ");
        }
    }
}
