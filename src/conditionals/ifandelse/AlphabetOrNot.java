package conditionals.ifandelse;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if(alphabet < 'a' && alphabet > 'z' || alphabet > 'A' && alphabet > 'Z'){
            System.out.print("This is an alphabet");
        }
        else{
            System.out.println("This is not an alphabet");
        }
    }
}
