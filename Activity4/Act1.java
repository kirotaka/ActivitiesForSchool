package Activity4;
import java.util.Scanner;

/*
 * Number 1
 * This program reads an integer from the user and determines whether it is
 * positive, negative, or zero.
 * zero is classified as a positive number.
 * Input: An integer number
 * Output: "POSITIVE" for numbers >= 0, "NEGATIVE" for numbers < 0
 */
public class Act1 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Input A Number:");

        // Read integer input from user
        int nm = sc.nextInt();
        
        // Determine if number is positive or negative
        // Note: Zero is considered positive per rubric requirements
        if (nm < 0) {
            System.out.println("NEGATIVE");
        } else {
            // This covers both positive numbers and zero
            System.out.println("POSITIVE");
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}



