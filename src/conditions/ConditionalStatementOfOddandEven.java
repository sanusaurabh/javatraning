package conditions;

import java.util.Scanner;

public class ConditionalStatementOfOddandEven {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.print("The number is even");

        }
        else{

            System.out.print("The number is odd");

        }


    }


}
