package Activity5;

/*
 * Number 8
 * This program prints two different patterns using nested loops:
 * Pattern I: A rectangle of asterisks (4 rows of 10 asterisks each)
 * Pattern II: A right triangle of asterisks (5 rows with increasing asterisks)
 * It demonstrates nested loop structures for creating visual patterns.
 * Input: None
 * Output: Two asterisk patterns displayed on the console
 */
public class Number8 {
    public static void main(String[] args) {
        // Pattern I: Rectangle pattern
        System.out.println("Pattern I:");
        
        // Outer loop: iterate through 4 rows
        for (int i = 0; i < 4; i++) {
            // Inner loop: print 10 asterisks in each row
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            // Move to next line after completing each row
            System.out.println();
        }
        
        // Blank line to separate the two patterns
        System.out.println();
        
        // Pattern II: Right triangle pattern
        System.out.println("Pattern II:");
        
        // Outer loop: iterate through 5 rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop: print i asterisks in row i
            // Row 1 has 1 asterisk, row 2 has 2 asterisks, etc.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to next line after completing each row
            System.out.println();
        }
    }
}
