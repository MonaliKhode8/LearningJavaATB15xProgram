package ex_07_Conditions_and_Loops;

import java.util.Scanner;

public class Lab004_ex4_Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();

        if (age>18){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }


    }
}
