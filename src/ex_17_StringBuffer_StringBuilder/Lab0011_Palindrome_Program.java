package ex_17_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab0011_Palindrome_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Palindrome String...");
        String input = sc.next();

        String Reverse_String = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            Reverse_String = Reverse_String + input.charAt(i);
        }
        if (Reverse_String.equalsIgnoreCase(input)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}