package Activity2;
import java.util.Scanner;

public class ActivityNo6 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // swapping logic
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Swapped: a = " + a + ", b = " + b);
        sc.close();
      }
    }
