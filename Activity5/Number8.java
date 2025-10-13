package Activity5;

/**
 * 8. Write a program to print following patterns:
 * 
 * i)  **********
 *     **********
 *     **********
 *     **********
 *
 * ii) *
 *     **
 *     ***
 *     ****
 *     *****
 */
public class Number8 {
    public static void main(String[] args) {
        // Pattern I: Rectangle pattern (4 rows x 10 columns)
        System.out.println("Pattern I:");
        
        // Outer loop: 4 rows
        for (int i = 0; i < 4; i++) {
            // Inner loop: 10 asterisks per row
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
        
        // Blank line between patterns
        System.out.println();
        
        // Pattern II: Right triangle pattern (5 rows, increasing)
        System.out.println("Pattern II:");
        
        // Outer loop: 5 rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop: print i asterisks on row i
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
