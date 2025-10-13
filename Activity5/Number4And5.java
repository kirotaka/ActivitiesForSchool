package Activity5;
import java.util.Scanner;
//4. Write a program that reads a set of integers, and then prints the sum of the even and
//odd integers.sc
public class Number4And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, Evensum = 0, Oddsum = 0;
        System.out.print("Enter the number of integers to process: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                Evensum += num;
            } else {
                Oddsum += num;
            }
        }
        System.out.println("Sum of even integers: " + Evensum);
        System.out.println("Sum of odd integers: " + Oddsum);
        sc.close();
    }
}
