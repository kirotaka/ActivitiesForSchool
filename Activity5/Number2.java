package Activity5;


// 2. Write a program to calculate the sum of first 10 natural numbers.
public class Number2 {
    public static void main(String[] args) {
        // Initialize sum variable to store cumulative total
        int sum = 0;
        
        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Add current number to sum
            sum += i;
            // Display the cumulative sum
            System.out.println(sum);
        }
    }
}
