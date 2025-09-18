package Activity2;
import java.util.Scanner;

public class ActivityNo9 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        // takes the input and converts to inches
        double feet = sc.nextDouble();
        double inches = feet * 12;
        // prints the result
        System.out.printf("Equivalent in inches: %.2f\n", inches);
        sc.close();
    }
}
