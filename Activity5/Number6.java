package Activity5;

import java.util.Scanner;

/**
 * 6. Write a program that prompts the user to input a positive integer. It should then output a
 * message indicating whether the number is a prime number.
 * 
 * A prime number is a natural number greater than 1 that has no positive divisors other than
 * 1 and itself. This program checks divisibility from 2 up to the square root of the number.
 */
public class Number6 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        // Validate input: check if number is positive
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        
        // Assume number is prime initially
        boolean isPrime = true;
        
        // Special case: 1 is not considered a prime number
        if (num == 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to square root of num
            // If num is divisible by any number in this range, it's not prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    // Found a divisor, so not prime
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Display result based on isPrime flag
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
