package ex_10_Switch_Case;

import java.util.Scanner;

public class Lab002_Switch_without_break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 to print day");
        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                case 2:
                    System.out.println("Tue");
                case 3:
                    System.out.println("Wed");
                case 4:
                    System.out.println("Thr");
                case 5:
                    System.out.println("Fri");
                case 6:
                    System.out.println("Sat");
                case 7:
                    System.out.println("Sun");
                default:
                    System.out.println("Invalid day");
            }
        } else
        {
            System.out.println("Enter a valid int number!!!!!");
        }

    }
}

