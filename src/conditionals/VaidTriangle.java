package conditionals;

import java.util.Scanner;

public class VaidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 =  sc.nextInt();
        int angle2 =  sc.nextInt();
        int angle3 =  sc.nextInt();

        int sum =  angle1 + angle2 + angle3;

        if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)  {
            System.out.println("This is a very valid triangle");
        }
        else{
            System.out.println("This is not a valid triangle");
        }

    }
}
