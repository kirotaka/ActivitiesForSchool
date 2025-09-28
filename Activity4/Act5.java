package Activity4;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character (m/f): ");
        String input = scanner.nextLine().trim().toLowerCase();
        String message;
        if (input.equals("m")) {
            message = "HELLO SIR";
        } else {
            message = "HELLO MADAM";
        }
        System.out.println(message);
        scanner.close();
    }
}
