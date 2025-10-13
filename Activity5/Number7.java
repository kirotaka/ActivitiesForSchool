package Activity5;

import java.util.Scanner;

/*
 * Number 7
 * This program uses a do-while loop to repeatedly ask the user to enter two numbers.
 * The numbers are added and the sum is displayed. After each operation, the program
 * asks the user whether they wish to continue. The loop repeats if the user chooses
 * to continue; otherwise, it terminates.
 * Input: Two positive numbers, and user's choice to continue (Y/N)
 * Output: Sum of the two numbers, and continuation or termination message
 */
public class Number7 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Variable to store user's choice to continue or terminate
        String YesOrNo;
        
        // Flag to control loop termination
        boolean terminate = false;
        
        // Do-while loop: executes at least once, then repeats based on condition
        do {
            // Prompt user to input two positive numbers
            System.out.println("Input two Positive Number");
            System.out.print("Enter first Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();
            
            // Validate input: check if both numbers are positive
            if ((num1 < 0) || (num2 < 0)) {
                // Invalid input: negative number detected
                System.out.println("Invalid Input, Please Use Positive Number");
            } else {
                // Valid input: calculate and display the sum
                System.out.println("The sum is " + (num1 + num2));
                
                // Ask user if they want to continue
                System.out.println("Do you wish to perform the operation again. (Y/N) ");
                YesOrNo = sc.next();
                
                // Check user's response (case-insensitive)
                if (YesOrNo.equalsIgnoreCase("Y")) {
                    // User wants to continue
                    System.out.println("Continue");
                } else {
                    // User wants to terminate
                    System.out.println("Program Terminated");
                    terminate = true;
                }
            }
        } while (!terminate); // Loop continues while terminate is false
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
