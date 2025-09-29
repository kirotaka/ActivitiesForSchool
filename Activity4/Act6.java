package Activity4;

import java.util.Scanner;

/*
 * Number 6
 * This program determines whether a given number is even or odd.
 * It uses the modulo operator (%) to check if the number is divisible by 2.
 * 
 * Input: An integer number
 * Output: "EVEN" if the number is even, "ODD" if the number is odd
 */
public class Act6 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for number input
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        
        // Check if number is even or odd using modulo operator
        if (num % 2 == 0) {
            // Number is divisible by 2, so it's even
            System.out.println("EVEN");
        } else {
            // Number has remainder when divided by 2, so it's odd
            System.out.println("ODD");
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}

