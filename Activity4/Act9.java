package Activity4;

import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        double price;
        switch (productId) {
            case 1: price = 50.55; break;
            case 2: case 9: price = 12.35; break;
            case 5: case 7: case 11: price = 11.46; break;
            default:
                System.out.println("Invalid Product ID");
                scanner.close();
                return;
        }
        System.out.println(price);
        scanner.close();
    }
}
