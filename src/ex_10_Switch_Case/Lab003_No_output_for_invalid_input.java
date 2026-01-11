package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab003_No_output_for_invalid_input {
    public static void main(String[] args) {

        // for output - enter number accept 1 and 2 - nothing will happen also not giving any error
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
        }

    }
}
