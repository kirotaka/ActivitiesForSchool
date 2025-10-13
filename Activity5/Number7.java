package Activity5;

import java.util.Scanner;

// Write a do-while loop that asks the user to enter two numbers. The numbers should be
// added and the sum displayed. The loop should ask the user whether he or she wishes to
// perform the operation again. If so, the loop should repeat; otherwise it should terminate.
public class Number7 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Variables to store user response and loop control
        String YesOrNo;
        boolean terminate = false;

        // Do-while loop: executes at least once
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
                
                // Ask if user wants to continue
                System.out.println("Do you wish to perform the operation again. (Y/N) ");
                YesOrNo = sc.next();
                
                // Check user's response (case-insensitive)
                if (YesOrNo.equalsIgnoreCase("Y")) {
                    System.out.println("Continue");
                } else {
                    // User chose to exit
                    System.out.println("Program Terminated");
                    terminate = true;
                }
            }
        }
        // Continue loop while terminate flag is false
        while (!terminate);

        // Close the scanner to free resources
        sc.close();
    }
}
