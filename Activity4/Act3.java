package Activity4;
import java.util.Scanner;

/*
 * Number 3
 * This program converts a numeric month (1-12) to its corresponding month name.
 * It uses a switch statement to map each number to the appropriate month.
 *
 * Input: An integer from 1 to 12 representing the month
 * Output: The name of the month, or "Invalid Number" for invalid input
 */
public class Act3 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for month number input
        System.out.print("Please input a number from 1 - 12: ");
        int months = sc.nextInt();
        
        // Use switch statement to convert number to month name
        switch (months) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                // Handle invalid input (numbers outside 1-12 range)
                System.out.println("Invalid Number");
                break;
        }
        
        // Close scanner to prevent resource leak
        sc.close();
    }
}
