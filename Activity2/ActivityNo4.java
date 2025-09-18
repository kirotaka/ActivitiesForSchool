package Activity2;
import java.util.Scanner;
public class ActivityNo4 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input two numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        // calculations for sum and product
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        sc.close();
    }
}
