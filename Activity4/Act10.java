package Activity4;

import java.util.Scanner;

/*
 * Number 10
 * This program converts letter grades to their corresponding descriptions.
 * It reads a character input and maps it to academic performance levels:
 * - A: EXCELLENT
 * - B: ABOVE AVERAGE
 * - C: AVERAGE
 * - D: BELOW AVERAGE
 * - F: FAILED
 * - Other inputs: INVALID INPUT
 * Input: A character representing a letter grade
 * Output: Performance description or error message for invalid input
 */
public class Act10 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Read and process user input (trim whitespace and convert to uppercase)
        System.out.print("Enter A Character: ");
        String raw = scanner.nextLine().trim().toUpperCase();
        
        // Check for empty input
        if (raw.isEmpty()) {
            System.out.println("INVALID INPUT");
            scanner.close();
            return;
        }
        
        // Extract the first character as the grade
        char grade = raw.charAt(0);
        
        // Variable to store the performance message
        String message;
        
        // Use switch statement to map grade to performance description
        switch (grade) {
            case 'A':
                // A grade represents excellent performance
                message = "EXCELLENT";
                break;
            case 'B':
                // B grade represents above average performance
                message = "ABOVE AVERAGE";
                break;
            case 'C':
                // C grade represents average performance
                message = "AVERAGE";
                break;
            case 'D':
                // D grade represents below average performance
                message = "BELOW AVERAGE";
                break;
            case 'F':
                // F grade represents failed performance
                message = "FAILED";
                break;
            default:
                // Invalid grade input
                System.out.println("INVALID INPUT");
                scanner.close();
                return;
        }
        
        // Display the performance message
        System.out.println(message);
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
