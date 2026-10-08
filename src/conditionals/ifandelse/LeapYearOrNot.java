package conditionals.ifandelse;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 400 == 0 && num % 100 != 0 && num % 4 == 0){
            System.out.println("The number is a leap year");
        }
        else{
            System.out.println("The number is not a leap year");
        }
    }
}
