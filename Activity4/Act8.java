package Activity4;

import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of registrants: ");
        int registrants = scanner.nextInt();
        int feePerPerson;
        if (registrants <= 0) {
            System.out.println("Error: Number of registrants must be greater than 0.");
        } else if (registrants >= 1 && registrants <= 4) {
            feePerPerson = 500;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        } else if (registrants >= 5 && registrants <= 10) {
            feePerPerson = 400;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        } else {
            feePerPerson = 300;
            int total = registrants * feePerPerson;
            System.out.println("Total amount owed: P" + total);
        }
        scanner.close();
    }
}
