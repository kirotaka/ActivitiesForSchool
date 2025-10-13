package Activity5;

import java.util.Scanner;

/*
 * Number 6
 * This program prompts the user to input a positive integer and determines whether
 * the number is a prime number. A prime number is a natural number greater than 1
 * that has no positive divisors other than 1 and itself.
 * Input: A positive integer
 * Output: Message indicating whether the number is prime or not
 */
public class Number6 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        // Validate input: check if the number is positive
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        
        // Assume the number is prime initially
        boolean ifPrime = true;
        
        // Special case: 1 is not considered a prime number
        if (num == 1) {
            ifPrime = false;
        } else {
            // Check for divisors from 2 to square root of num
            // If num is divisible by any number in this range, it's not prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // Check if i divides num evenly
                if (num % i == 0) {
                    // Found a divisor, so num is not prime
                    ifPrime = false;
                    break; // No need to check further
                }
            }
        }
        
        // Display the result based on the prime check
        if (ifPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
