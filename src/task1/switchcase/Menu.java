package task1.switchcase;
//Print a menu choice: 1 = Tea, 2 = Coffee, 3 = Juice.
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice =  sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Tea ??");
                break;
            case 2:
                System.out.println("Coffee ??");
                break;
            case 3:
                System.out.println("Juice ??");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
