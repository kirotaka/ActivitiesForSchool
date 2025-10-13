package Activity5;

import java.util.Scanner;

/**
 * 7. Write a do-while loop that asks the user to enter two numbers. The numbers should be
 * added and the sum displayed. The loop should ask the user whether he or she wishes to
 * perform the operation again. If so, the loop should repeat; otherwise it should terminate.
 */
public class Number7 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Variable to store user's choice to continue or terminate
        String yesOrNo;
        // Flag to control loop termination
        boolean terminate = false;
        
        // Do-while loop to repeat the addition operation
        do {
            // Prompt user to enter two positive numbers
            System.out.println("Input two Positive Number");
            System.out.print("Enter first Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();
            
            // Validate that both numbers are positive
            if ((num1 < 0) || (num2 < 0)) {
                System.out.println("Invalid Input, Please Use Positive Number");
            } else {
                // Calculate and display the sum
                System.out.println("The sum is " + (num1 + num2));
                
                // Ask user if they want to continue
                System.out.println("Do you wish to perform the operation again. (Y/N) ");
                yesOrNo = sc.next();
                
                // Check user's response
                if (yesOrNo.equalsIgnoreCase("Y")) {
                    System.out.println("Continue");
                } else {
                    System.out.println("Program Terminated");
                    terminate = true;
                }
            }
        } while (!terminate);
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
