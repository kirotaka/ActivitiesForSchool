package Activity4;

import java.util.Scanner;

/*
 * Number 9
 * This program displays product prices based on Product ID using a switch statement.
 * Different product IDs map to specific prices:
 * - Product ID 1: P50.55
 * - Product IDs 2, 9: P12.35
 * - Product IDs 5, 7, 11: P11.46
 * - Other IDs: Invalid Product ID message
 * Input: Product ID (integer)
 * Output: Product price or error message for invalid ID
 */
public class Act9 {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for product ID
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        
        // Variable to store the price
        double price;
        
        // Use switch statement to determine price based on product ID
        switch (productId) {
            case 1: 
                // Product ID 1 has unique price
                price = 50.55; 
                break;
            case 2: 
            case 9: 
                // Product IDs 2 and 9 share the same price
                price = 12.35; 
                break;
            case 5: 
            case 7: 
            case 11: 
                // Product IDs 5, 7, and 11 share the same price
                price = 11.46; 
                break;
            default:
                // Invalid product ID - display error and exit
                System.out.println("Invalid Product ID");
                scanner.close();
                return;
        }
        
        // Display the price for valid product ID
        System.out.println(price);
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
