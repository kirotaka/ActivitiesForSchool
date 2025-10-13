package Activity5;

//8. Write a program to print following :
//i) **********
//   **********
//   **********
//   **********
//
//ii)*
//   **
//   ***
//   ****
//   *****

public class Number8 {
    public static void main(String[] args) {
        // Pattern i:
        System.out.println("Pattern I:");
        // First pattern: 4 rows of 10 asterisks
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // Blank line between patterns
        // Pattern ii:
        System.out.println("Pattern II:");
        // Second pattern: 5 rows, increasing asterisks
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
