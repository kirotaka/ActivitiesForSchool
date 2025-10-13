package Activity5;

import java.util.Scanner;

/*
 * Number 3
 * This program prompts the user to input an integer and then outputs the number
 * with its digits reversed. For example, if the input is 12345, the output should be 54321.
 * It demonstrates digit manipulation using modulo and division operations.
 * Input: An integer number
 * Output: The same number with digits reversed
 */
public class Number3 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize variable to store reversed number
        int reversed = 0;
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Loop to reverse the digits
        // Continue until all digits are processed (num becomes 0)
        for (; num != 0; num /= 10) {
            // Extract the rightmost digit using modulo
            int digit = num % 10;
            
            // Build reversed number by shifting left and adding the digit
            reversed = reversed * 10 + digit;
        }
        
        // Display the reversed number
        System.out.println("Reversed Number: " + reversed);
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
