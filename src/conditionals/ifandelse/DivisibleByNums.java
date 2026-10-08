package conditionals.ifandelse;

import java.util.Scanner;

public class DivisibleByNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =  sc.nextInt();

        if (num % 5 == 0){
            System.out.println("The number is divisible by 5");
        }
        if (num % 11 == 0){
            System.out.println("The number is divisible by 11");
        }
        if(num % 5 != 0 && num % 11 != 0){
            System.out.println("The number is not divisible by both 5 and 11");
        }
    }
}
