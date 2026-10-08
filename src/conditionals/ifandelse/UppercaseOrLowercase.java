package conditionals.ifandelse;

import java.util.Scanner;

public class UppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if(alphabet < 'a' && alphabet > 'z'){
            System.out.print("The alphabet is a lower case letter");
        }
        else{
            System.out.print("The alphabet is a upper case letter");
        }
    }
}
