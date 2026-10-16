package conditions;

import java.util.Scanner;

public class CheckUpperLower {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Character :");
        char ch = scan.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println("A Lowercase Alphabet");
        }
        else
        {
            System.out.println("An Uppercase Alphabet");
        }
    }
}
