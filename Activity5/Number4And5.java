package Activity5;

import java.util.Scanner;

// 4. Write a program that reads a set of integers, and then prints the sum of the even and
// odd integers.
public class Number4And5 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables for count, current number, and sums
        int n, num, evenSum = 0, oddSum = 0;
        
        // Prompt user for the count of integers to process
        System.out.print("Enter the number of integers to process: ");
        n = sc.nextInt();

        // Prompt user to enter the integers
        System.out.println("Enter " + n + " integers:");
        
        // Loop through each integer
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            
            // Check if number is even or odd and add to respective sum
            if (num % 2 == 0) {
                // Even number: divisible by 2
                evenSum += num;
            } else {
                // Odd number: not divisible by 2
                oddSum += num;
            }
        }
        
        // Display the results
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        
        // Close the scanner to free resources
        sc.close();
    }
}
