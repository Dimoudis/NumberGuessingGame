package numberguessing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int target = (int)(Math.random() * 100) + 1; // Random number between 1-100
        // System.out.println("DEBUG: target = " + target);

        int number = -1; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");

        while (number != target) {
            number = sc.nextInt();
            count++; // Count each attempt

            if (number > target) {
                System.out.println("Your number is too high.");
            } else if (number < target) {
                System.out.println("Your number is too low.");
            } else {
                System.out.println("Congratulations! You guessed the number " + target + " in " + count + " attempts.");
            }
        }
        sc.close();
        // DEBUG: to see the target number (can be removed)
        System.out.println("DEBUG: target = " + target);
    }
}