package Activity5;

import java.util.Scanner;

/**
 * 3. Write a program that prompts the user to input an integer and then outputs the number
 * with the digits reversed. For example, if the input is 12345, the output should be 54321.

 */
public class Number3 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize variable to store the reversed number
        int reversed = 0;
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Loop to reverse the digits
        // Continue while there are digits remaining in num
        for (; num != 0; num /= 10) {
            // Extract the rightmost digit
            int digit = num % 10;
            // Build reversed number: shift left and add new digit
            reversed = reversed * 10 + digit;
        }
        
        // Display the reversed number
        System.out.println("Reversed Number: " + reversed);
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
