package switchCase;

import java.util.Scanner;

public class TrafficLight {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter light color (RED, YELLOW, GREEN): ");
            String color = sc.next();

            switch (color) {
                case "RED":
                    System.out.println("STOP");
                    break;
                case "YELLOW":
                    System.out.println("GET READY");
                    break;
                case "GREEN":
                    System.out.println("GO");
                    break;
                default:
                    System.out.println("Invalid color!");
        }
    }
}
