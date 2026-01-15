package ex_15_Functions;

import java.util.Scanner;

public class Lab004_Programs_with_user_defined_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =sum_of_two_numbers(a,b);
        System.out.println("The Sum of two numbers are"+ sum);
    }
    static int sum_of_two_numbers(int x, int y){
        return x+y;
    }
}
