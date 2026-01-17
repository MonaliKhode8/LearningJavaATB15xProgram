package ex_16_String;

import java.util.Scanner;

public class Lab010_String_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.next();
        String rev = "";

        for(int i = input.length()-1; i>=0;i--){
        rev = rev + input.charAt(i);
        }
        System.out.println(rev);
    }
}
