package conditions;

import java.util.Scanner;

public class RainCondition {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hii is it raining today? Provide input in true or false");

        boolean isRainging = input.nextBoolean();

        if(isRainging){
            System.out.print("Take umbrella ");
        }
        System.out.println("Leave home");

    }
}
