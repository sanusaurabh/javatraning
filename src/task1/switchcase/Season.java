package task1.switchcase;

import java.util.Scanner;
//Print the season based on a month number, using these groups: winter (December–February), summer (March–May),
// rainy (June–September), autumn (October–November).

    public class Season {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter month number (1-12): ");
            int month = input.nextInt();

            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("Summer");
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("Rainy");
                    break;

                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;

                default:
                    System.out.println("Invalid month number");
            }

            input.close();
        }
    }


