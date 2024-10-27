package Oct.ex_17102024;

import java.util.Scanner;

public class Lab061_If_else {
    public static void main(String[] args) {
//        int election_date = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the election date: \n");
        int election = sc.nextInt();

        if(election >=31)
        {
            System.out.println("Election declare");
        }
        else
        {
            System.out.println("Election not declare");
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age.");
        int age = s .nextInt();

        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.
        if(age > 18){
            System.out.println("Allowed to vote!");
        }
        else {
            System.out.println("Not Allowed!");
        }
    }
}
