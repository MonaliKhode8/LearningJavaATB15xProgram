package ex_07_Conditions_and_Loops;

import java.util.Scanner;

public class Lab005_ex5_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        double d = scanner.nextDouble();
        float f = scanner.nextFloat();
        if(age>18){
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Bye");
        }

    }
}
