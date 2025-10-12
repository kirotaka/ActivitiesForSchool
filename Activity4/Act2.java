package Activity4;
import java.util.Scanner;

/*
 * Number 2
 * This program checks if a given number is divisible by 5.
 * It reads an integer from the user and uses the modulo operator
 * to determine divisibility.
 * Input: An integer number
 * Output: "DIVISIBLE" if the number is divisible by 5, "NOT DIVISIBLE" otherwise
 */
public class Act2 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input and read the number
        System.out.print("Input a number: ");
        int divisible = sc.nextInt();
        
        // Check if the number is divisible by 5 using modulo operator
        if (divisible % 5 == 0) {
            System.out.println("DIVISIBLE");
        } else {
            System.out.println("NOT DIVISIBLE");
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
