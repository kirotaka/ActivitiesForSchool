package Activity4;

import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("YOU ARE NOT QUALIFIED TO VOTE");
        } else if (age >= 19) {
            System.out.println("YOU ARE QUALIFIED TO VOTE");
        }
        scanner.close();
    }
}
