package switchCase;

import java.util.Scanner;

public class MummysDialogue {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Tune kya kiya?");
            System.out.println("1. Ghar late aaya");
            System.out.println("2. Kam number aaye");
            System.out.println("3. Din bhar phone chalaya");
            System.out.println("4. Khana nahi khaya");
            System.out.print("Apni galti ka number daalo (1-4): ");
            int mistake = sc.nextInt();

            switch (mistake) {
                case 1:
                    System.out.println("Mummy bolegi: Kahan ghoom rahi thi ab tak? Time dekha hai?");
                    break;
                case 2:
                    System.out.println("Mummy bolegi: Din bhar mobile chalao, ab dekho natija!");
                    break;
                case 3:
                    System.out.println("Mummy bolegi: La idhar de phone, isko tod ke phek dungi!");
                    break;
                case 4:
                    System.out.println("Mummy bolegi: Khana nahi khayegi to hawa kha ke jiyegi kya?");
                    break;
                default:
                    System.out.println("Mummy bolegi: Aaj to bach gayi, ja padhai kar le!");
        }
    }
}
