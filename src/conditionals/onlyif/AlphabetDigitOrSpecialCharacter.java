package conditionals.onlyif;

import java.util.Scanner;

public class AlphabetDigitOrSpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        if(input > 'a' && input < 'z' || input > 'A' && input < 'Z'){
            System.out.print("This is an alphabet");

        }
        if(input > 0 && input < 9){
            System.out.print("This is a digit");
        }
        if (!(input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z') && input >= '0' && input <= '9' ) {
            System.out.print("This is a special character");
        }

    }
}
