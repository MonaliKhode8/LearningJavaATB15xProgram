package ex_15_Functions;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Lab006_Calculator_Program_using_functions{
    public static void main(String[] args) {

        //create a program for function of Sub, Sum, Mul and Div
        // with parameter a,b (take the parameter from the user)

        Scanner sc =new Scanner(System.in);
        int a = readInt(sc,"Enter the Num1:");
        int b = readInt(sc, "Enter the Num2");

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println("The Sum of a and b is " + result_sum);
        System.out.println("The Sub of a and b is " + result_sub);
        System.out.println("The Mul of a and b is " + result_mul);
        System.out.println("The Div of a and b is " + result_div);
        System.out.println("The Mod of a and b is " + result_mod);
    }

    static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()){
            return sc.nextInt();
        }else{
            System.out.println("Enter the int only!");
            System.exit(0);
            return 0;
        }
        }
        static int sum(int a, int b){
            return a+b;
        }
        static int sub(int a, int b){
            return a-b;
        }
        static int mul(int a, int b){
            return a*b;
        }
        static int div(int a, int b)throws ArithmeticException {
            if(b==0){
                throw new ArithmeticException("Divisio by zero is not allowed");
            }
            return a/b;
        }
        static int mod(int a, int b){
            return a%b;
        }
}