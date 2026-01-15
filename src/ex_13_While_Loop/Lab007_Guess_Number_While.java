package ex_13_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab007_Guess_Number_While {
    public static void main(String[] args) {
        // Guess the Number from 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        //System.out.println(numberToGuess);

        Scanner scannar = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;

        while (true) {
            if (!scannar.hasNextInt()) {
                System.out.println("Invalid input!! Please enter a valid integer input ");
                scannar.next();
                continue;
            }
            guess = scannar.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too Low, Try again!!!");
            } else if (guess > numberToGuess) {
                System.out.println("Too High, Try again!!!");
            } else {
                System.out.println("Correct Attempt: " + attempts);
            }
            scannar.close();
        }
    }
}