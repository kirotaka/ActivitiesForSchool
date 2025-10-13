package Activity5;

// 8. Write a program to print following :
// i) **********
//    **********
//    **********
//    **********
//
// ii) *
//     **
//     ***
//     ****
//     *****

public class Number8 {
    public static void main(String[] args) {
        // Pattern i: Print a rectangle of asterisks (4 rows x 10 columns)
        System.out.println("Pattern I:");
        
        // Outer loop: iterate through 4 rows
        for (int i = 0; i < 4; i++) {
            // Inner loop: print 10 asterisks per row
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
        
        // Blank line between patterns for better readability
        System.out.println();
        
        // Pattern ii: Print a right triangle of asterisks (5 rows)
        System.out.println("Pattern II:");
        
        // Outer loop: iterate through 5 rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop: print i asterisks in row i
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
