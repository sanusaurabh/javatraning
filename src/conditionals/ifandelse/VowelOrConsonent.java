package conditionals.ifandelse;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'
        || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
            System.out.println("The alphabet is a vowel");
        }
        else{
            System.out.println("The alphabet is not a vowel");
        }
    }
}
