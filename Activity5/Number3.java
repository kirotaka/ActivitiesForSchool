package Activity5;

// Write a program that prompts the user to input an integer and then outputs the number
// with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Initialize variable to store the reversed number
        int reversed = 0;
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Reverse the digits using modulo and division
        for (; num != 0; num /= 10) {
            // Extract the last digit
            int digit = num % 10;
            
            // Build reversed number by shifting left and adding digit
            reversed = reversed * 10 + digit;
        }

        // Display the reversed number
        System.out.println("Reversed Number: " + reversed);
        
        // Close the scanner to free resources
        sc.close();
    }
}
