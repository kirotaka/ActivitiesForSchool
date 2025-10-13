package Activity5;

import java.util.Scanner;

/**
 * 4. Write a program that reads a set of integers, and then prints the sum of the even and
 * odd integers.
 * 
 * This program prompts the user to enter how many integers they want to process,
 * then reads each integer and categorizes it as even or odd. Finally, it displays
 * the sum of even integers and the sum of odd integers separately.
 */
public class Number4And5 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables
        int n, num, evenSum = 0, oddSum = 0;
        
        // Prompt user for the count of integers
        System.out.print("Enter the number of integers to process: ");
        n = sc.nextInt();
        
        // Prompt user to enter the integers
        System.out.println("Enter " + n + " integers:");
        
        // Loop through each integer
        for (int i = 0; i < n; i++) {
            // Read the next integer
            num = sc.nextInt();
            
            // Check if number is even or odd
            if (num % 2 == 0) {
                // Even number: add to evenSum
                evenSum += num;
            } else {
                // Odd number: add to oddSum
                oddSum += num;
            }
        }
        
        // Display results
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
