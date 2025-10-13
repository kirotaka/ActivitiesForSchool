package Activity5;
import java.util.Scanner;
// 6. Write a program that prompts the user to input a positive integer. It should then output a
//message indicating whether the number is a prime number.
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        boolean ifPrime = true;
        if (num == 1) {
            ifPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ifPrime = false;
                    break;
                }
            }
        }
        if (ifPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
