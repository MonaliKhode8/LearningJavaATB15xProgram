package ex_18_Arrays;

import java.util.Scanner;

public class Lab007_Array_User_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();

        int[] num=new int[size];

        for (int i=0;i<num.length;i++){
            System.out.println("Enter the Marks");
            num[i]= sc.nextInt();
        }
        System.out.println("========");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
