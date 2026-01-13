package Activity9;
import java.util.Scanner;

public class AiVaniesFoodServices {

    // Arrays storing menu items and their corresponding costs
    static String[] items = {
            "PORK SIOMAI",
            "BEEF SIOMAI",
            "SHRIMP SIOMAI",
            "COKE",
            "ROYAL",
            "SPRITE"
    };

    static double[] prices = {20.00, 25.00, 30.00, 20.00, 20.00, 20.00};
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        double grandTotal = 0.0;

        // Loop to process multiple customer transactions
        do {
            System. out.println("\n\tAIVANIE'S LOVE FOOD CART");
            System.out. println("\n\tWHAT'S YOUR ORDER MA'AM/SIR....\n");

            int[] quantities = new int[items.length];

            // Collect customer order and print order summary
            getOrders(quantities);
            double currentTotal = displayReceipt(quantities);

            grandTotal += currentTotal;

            System.out.print("\nDo you want to continue? (y/n)");
            choice = scan.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Display final total after all transactions
        System.out. println("\nGRAND TOTAL : " + String.format("%.2f", grandTotal));
        System.out.println("Press any key to continue . . .");
        System.out.println("\nProgrammer's Name: Toledo Ivan P.");
        scan.close();
    }

    // Method to collect quantity inputs from customer
    public static void getOrders(int[] quantities) {
        for (int i = 0; i < items.length; i++) {
            System.out.print("ENTER THE NUMBER OF " + items[i] + " ORDERED (" + String.format("%.2f", prices[i]) + "): ");
            quantities[i] = scan.nextInt();
        }
    }

    // Method to print receipt and compute order total
    public static double displayReceipt(int[] quantities) {
        double totalAmount = 0.0;

        System.out.println("\n\tAIVANIE'S SIOMAI LOVE FOOD CART");
        System.out.println("\n\t******************************************************");
        System.out.println("\tPARTICULARS\t\tQUANTITY\tAMOUNT");

        for (int i = 0; i < items.length; i++) {
            if (quantities[i] > 0) {
                double amount = quantities[i] * prices[i];
                // Adjust spacing dynamically based on product name length
                int len = items[i].length();
                String tab = (len < 12) ? "\t\t\t" : "\t\t";

                System.out.println("\t" + items[i] + tab + quantities[i] + "\t\t" + String.format("%.2f", amount));
                totalAmount += amount;
            }
        }

        System.out. println("\n\t\tTOTAL\t\t\t\t" + String. format("%.2f", totalAmount));
        System.out.println("\n\t\tTHANK YOU. COME AGAIN.");

        return totalAmount;
    }
}