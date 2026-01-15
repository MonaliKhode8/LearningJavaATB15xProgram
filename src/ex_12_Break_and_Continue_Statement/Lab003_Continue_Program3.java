package ex_12_Break_and_Continue_Statement;

import java.util.Scanner;

public class Lab003_Continue_Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int Num = sc.nextInt();
        for(int i=0;i<Num;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
