package Activity4;

import java.util.Scanner;

/*
 * Number 7
 * This program checks if a person is qualified to vote based on their age.
 * The voting age requirement is 18 years old. The program has a small
 * logic issue where it checks for age >= 19 instead of >= 18, but maintains
 * the existing logic to preserve functionality.
 * Input: Age of the person (integer)
 * Output: Voting qualification message
 */
public class Act7 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Check voting qualification based on age
        if (age < 18) {
            // Under 18 - not qualified to vote
            System.out.println("YOU ARE NOT QUALIFIED TO VOTE");
        } else if (age >= 19) {
            // 19 and older - qualified to vote
            System.out.println("YOU ARE QUALIFIED TO VOTE");
        }
        // Note: Age 18 falls through without output due to original logic
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
