package Activity5;

// 2. Write a program to calculate the sum of first 10 natural number.
public class Number2 {
    public static void main(String[] args) {
        // Initialize sum to store the cumulative total
        int sum = 0;
        
        // Loop through numbers 1 to 10 (inclusive)
        for (int i = 1; i <= 10; i++) {
            // Add current number to sum
            sum += i;
        }
        
        // Print the final sum of first 10 natural numbers
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}
