package conditionals.onlyif;

import java.util.Scanner;
/*For first 50 units Rs. 0.50/unit
For next 150 units Rs. 0.75/unit
For next 250 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/

public class ElectricityUnitToRupees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your electricity units: ");
        float unit =  sc.nextFloat();
        float amount = 0;

        if (unit <= 50){
            amount = unit * 0.50f;
        }
        if(unit <= 150 && unit > 50){
            amount = unit * 0.75f;
        }
        if(unit <= 250 && unit > 150){
            amount = unit * 1.20f;
        }
        if(unit > 250){
            amount = unit * 1.50f;
        }

        float surcharge = amount * 0.2f;
        float bill = amount + surcharge;

        System.out.println("Your total bill amount is = " + bill);
    }


}
