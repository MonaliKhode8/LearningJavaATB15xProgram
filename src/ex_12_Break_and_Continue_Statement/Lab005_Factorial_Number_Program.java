package ex_12_Break_and_Continue_Statement;

import java.util.Scanner;

public class Lab005_Factorial_Number_Program {
    public static void main(String[] args) {

        System.out.println("Enter a positive number to get the factorial");
        Scanner sc = new Scanner(System.in);
        int fact = 1;

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Please enter a valid int value");
        }
        sc.close();
    }
}