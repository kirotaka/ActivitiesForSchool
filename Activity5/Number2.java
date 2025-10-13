package Activity5;

/*
 * Number 2
 * This program calculates the sum of the first 10 natural numbers (1 to 10).
 * It demonstrates accumulation using a loop and displays the cumulative sum
 * at each iteration.
 * Input: None
 * Output: Cumulative sum after adding each number from 1 to 10
 */
public class Number2 {
    public static void main(String[] args) {
        // Initialize sum variable to accumulate the total
        int sum = 0;
        
        // Loop through numbers 1 to 10 (inclusive)
        for (int i = 1; i <= 10; i++) {
            // Add current number to the running sum
            sum += i;
            
            // Display the cumulative sum after each addition
            System.out.println(sum);
        }
    }
}
