package Activity5;

import java.util.Scanner;

// 6. Write a program that prompts the user to input a positive integer. It should then output a
// message indicating whether the number is a prime number.
public class Number6 {
    public static void main(String[] args) {
        // Create Scanner object for user input
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
        boolean ifPrime = true;
        
        // Special case: 1 is not a prime number
        if (num == 1) {
            ifPrime = false;
        } else {
            // Check divisibility from 2 to square root of num
            // If num is divisible by any number in this range, it's not prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    // Found a divisor, so num is not prime
                    ifPrime = false;
                    break;
                }
            }
        }
        
        // Display result based on prime check
        if (ifPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close the scanner to free resources
        sc.close();
    }
}
