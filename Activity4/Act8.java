package Activity4;

import java.util.Scanner;

/*
 * Number 8
 * This program calculates registration fees based on the number of registrants.
 * It uses a tiered pricing system:
 * - 1-4 registrants: P500 per person
 * - 5-10 registrants: P400 per person  
 * - 11+ registrants: P300 per person
 * 
 * Input: Number of registrants (integer)
 * Output: Total amount owed or error message for invalid input
 */
public class Act8 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for number of registrants
        System.out.print("Enter the number of registrants: ");
        int registrants = scanner.nextInt();
        
        // Variable to store fee per person based on tier
        int feePerPerson;
        
        // Determine fee tier and calculate total
        if (registrants <= 0) {
            // Invalid input - must have at least 1 registrant
            System.out.println("Error: Number of registrants must be greater than 0.");
        } else if (registrants >= 1 && registrants <= 4) {
            // Tier 1: 1-4 registrants at P500 each
            feePerPerson = 500;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        } else if (registrants >= 5 && registrants <= 10) {
            // Tier 2: 5-10 registrants at P400 each
            feePerPerson = 400;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        } else {
            // Tier 3: 11+ registrants at P300 each
            feePerPerson = 300;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        }
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
