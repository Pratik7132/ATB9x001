package Oct.ex_17102024;

import java.util.Scanner;

public class Lab060_ifCondition {
    public static void main(String[] args) {
        int diwali_date = 01;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the date of diwali :");
        int diwali_date = sc.nextInt();
        */
        if(diwali_date ==01)
        {
            System.out.println("Happy diwali everyone");
        }
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        if(age > 18) {
            System.out.println("Allowed to vote!");
        }
    }
}
