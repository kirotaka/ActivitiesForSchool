package Activity4;

import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String raw = scanner.nextLine().trim().toUpperCase();
        if (raw.isEmpty()) {
            System.out.println("INVALID INPUT");
            scanner.close();
            return;
        }
        char grade = raw.charAt(0);
        String message;
        switch (grade) {
            case 'A':
                message = "EXCELLENT";
                break;
            case 'B':
                message = "ABOVE AVERAGE";
                break;
            case 'C':
                message = "AVERAGE";
                break;
            case 'D':
                message = "BELOW AVERAGE";
                break;
            case 'F':
                message = "FAILED";
                break;
            default:
                System.out.println("INVALID INPUT");
                scanner.close();
                return;
        }
        System.out.println(message);
        scanner.close();
    }
}
