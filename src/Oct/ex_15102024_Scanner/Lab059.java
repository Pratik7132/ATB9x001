package Oct.ex_15102024_Scanner;


import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age = \n");
        int age= scanner.nextInt();
        System.out.println(age>20 ? "Allowed" : "Not allowed");
    }
}
