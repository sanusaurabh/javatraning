package elseifcondition;

import java.util.Scanner;

public class TrafficLightSimulator {

    /* Take traffic light color as string input
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter traffic light color(Red, Yellow, Green):");
        String color = input.next();

        if(color.equals("Red")){
            System.out.println("Stop");}

        else if (color.equals("Yellow")){
            System.out.println("Wait");}

        else if (color.equals("Green")){
             System.out.println("Go");}

        else{
            System.out.println("Invalid");
        }
    }
}
