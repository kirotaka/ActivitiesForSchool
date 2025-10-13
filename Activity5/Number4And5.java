package Activity5;

import java.util.Scanner;

/*
 * Number 4 and 5
 * This program reads a set of integers and then prints the sum of the even and odd integers.
 * It demonstrates conditional logic to separate even and odd numbers and accumulate their sums.
 * Input: Number of integers to process, followed by the integers themselves
 * Output: Sum of even integers and sum of odd integers
 */
public class Number4And5 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Declare variables: n = count of integers, num = current number
        // Evensum = accumulator for even numbers, Oddsum = accumulator for odd numbers
        int n, num, Evensum = 0, Oddsum = 0;
        
        // Prompt user to enter how many integers to process
        System.out.print("Enter the number of integers to process: ");
        n = sc.nextInt();
        
        // Prompt user to enter the integers
        System.out.println("Enter " + n + " integers:");
        
        // Loop through all n integers
        for (int i = 0; i < n; i++) {
            // Read the current integer
            num = sc.nextInt();
            
            // Check if the number is even or odd using modulo operator
            if (num % 2 == 0) {
                // Even number: add to even sum
                Evensum += num;
            } else {
                // Odd number: add to odd sum
                Oddsum += num;
            }
        }
        
        // Display the results
        System.out.println("Sum of even integers: " + Evensum);
        System.out.println("Sum of odd integers: " + Oddsum);
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
