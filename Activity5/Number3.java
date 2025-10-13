package Activity5;

//Write a program that prompts the user to input an integer and then outputs the number
//with the digits reversed. For example, if the input is 12345, the output should be 54321.
import java.util.Scanner;
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversed = 0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
        sc.close();
    }
}
