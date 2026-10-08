package conditionals.elseif;

import java.util.Scanner;

/*Write a Java program using if-else-if to calculate the salary bonus of an employee.
Salary:
Below ₹20,000       — 10% bonus
₹20,000 to ₹40,000  — 15% bonus
₹40,001 to ₹60,000  — 20% bonus
Above ₹60,000       — 25% bonus
 If salary is 0 or negative, print: Invalid salary.*/
public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary - ");
        double salary = sc.nextDouble();
        if(salary > 0 && salary < 20000){
            double bonus = (salary * 10 / 100) + salary;
            System.out.println("Your salary wtith bonus is: " + bonus);
        }
        else if (salary > 20001 && salary <= 40000) {
            double bonus = (salary * 15 / 100) + salary;
            System.out.println("Your salary wtith bonus is: " + bonus);
        }
        else if (salary > 40001 && salary <= 60000) {
            double bonus = (salary * 20 / 100) + salary;
            System.out.println("Your salary wtith bonus is: " + bonus);
        }
        else if (salary > 60001 && salary >= 80000) {
            double bonus = (salary * 25 / 100) + salary;
            System.out.println("Your salary wtith bonus is: " + bonus);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
