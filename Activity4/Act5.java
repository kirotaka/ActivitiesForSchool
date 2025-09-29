package Activity4;

import java.util.Scanner;

/*
 * Number 5
 * This program greets the user based on their gender input.
 * It reads a character (m/f) and displays an appropriate greeting:
 * - 'm' displays "HELLO SIR"
 * - Any other input displays "HELLO MADAM"
 * 
 * Input: A character representing gender (m for male, f for female)
 * Output: Gender-appropriate greeting message
 */
public class Act5 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for gender input
        System.out.print("Enter a character (m/f): ");
        String input = scanner.nextLine().trim().toLowerCase();
        
        // Determine appropriate greeting based on input
        String message;
        if (input.equals("m")) {
            // Male greeting
            message = "HELLO SIR";
        } else {
            // Default greeting for female or any other input
            message = "HELLO MADAM";
        }
        
        // Display the greeting message
        System.out.println(message);
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
