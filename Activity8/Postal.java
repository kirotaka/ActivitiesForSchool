package Activity8;
import javax.swing.*;
import java.text.DecimalFormat;

// Main Method Here ↓↓↓
public class Postal {
    public static void main(String[] args) {
        // Start program by delegating to PostalHelper
        new PostalHelper().run();
        System.exit(0);
    }
}
// Important Class here ↓↓↓
// Simple container for city data (id, name, charge)
class City {
    final int id;
    final String name;
    final double charge;

    // Constructor: create a City with id, name and base charge
    City(int id, String name, double charge) { this.id = id; this.name = name; this.charge = charge; }
}

// Holds a city selection and whether express was chosen
class Transaction {
    final City city;
    final boolean express;
    static final double EXPRESS_FEE = 150.0;

    // Constructor: create a Transaction for a city and express flag
    Transaction(City city, boolean express) { this.city = city; this.express = express; }

    // Method with a parameter: caller can decide whether to apply the express fee
    double total(boolean useExpress) {
        return city.charge + (useExpress ? EXPRESS_FEE : 0.0);
    }

    // Convenience no-arg method that uses the object's express field
    double total() {
        return total(express);
    }
}


// PostalHelper contains all interaction and logic.

class PostalHelper {
    private final City[] CITIES = {
            null,
            new City(1, "MANILA", 175.0),
            new City(2, "PASAY", 150.0),
            new City(3, "QUEZON", 200.0),
            new City(4, "TAGUIG", 250.0),
            new City(5, "MAKATI", 275.0)
    };
    // for the format of the numbers
    private final DecimalFormat df = new DecimalFormat("#0.00");

    // run(): main interaction loop, handles transactions and final summary
    void run() {
        double totalCollection = 0.0;
        int transactions = 0;

        while (true) {
            String cityInput = JOptionPane.showInputDialog(null, buildHeader() + "\nEnter city number (1-5):",
                    "HIJK POSTAL SERVICES", JOptionPane.QUESTION_MESSAGE);
            if (cityInput == null) break; // user cancelled
            cityInput = cityInput.trim();
            if (!cityInput.matches("[1-5]")) {
                JOptionPane.showMessageDialog(null, "Please enter a number 1-5.", "Input Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            City city = CITIES[Integer.parseInt(cityInput)];

            String expressInput = JOptionPane.showInputDialog(null,
                    "EXPRESS DELIVERY? (Y/N):\n(IF YES, ADD 150.00)", "Express Delivery", JOptionPane.QUESTION_MESSAGE);
            boolean isExpress = expressInput != null && expressInput.trim().toUpperCase().startsWith("Y");

            // Create a Transaction and call the method with a parameter
            Transaction txn = new Transaction(city, isExpress);
            double totalCharge = txn.total(isExpress); // <-- method with parameter used here

            String msg = "HIJK POSTAL SERVICES\nROXAS BOULEVARD, MANILA\n\n"
                    + "CITY: " + city.name + " - " + df.format(city.charge) + "\n"
                    + "EXPRESS: " + (isExpress ? "YES (150.00 added)" : "NO") + "\n\n"
                    + "TOTAL CHARGE: " + df.format(totalCharge);
            JOptionPane.showMessageDialog(null, msg, "Transaction", JOptionPane.INFORMATION_MESSAGE);

            totalCollection += totalCharge;
            transactions++;

            String again = JOptionPane.showInputDialog(null, "PROCESS ANOTHER? (Y/N):", "Continue?", JOptionPane.QUESTION_MESSAGE);
            if (again == null || !again.trim().toUpperCase().startsWith("Y")) break;
        }

        if (transactions == 0) {
            JOptionPane.showMessageDialog(null, "No transactions were processed.", "Summary", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // summaryPrompt: ask for operator name and show totals
        String summaryPrompt = "TOTAL COLLECTION FOR THE DAY: " + df.format(totalCollection) + "\n"
                + "TOTAL NO. OF TRANSACTION: " + transactions + "\n\n"
                + "YOUR NAME: (SURNAME, FIRSTNAME, MI)";
        String name = JOptionPane.showInputDialog(null, summaryPrompt, "End of Day Summary", JOptionPane.QUESTION_MESSAGE);

        String receipt = "TOTAL COLLECTION FOR THE DAY: " + df.format(totalCollection) + "\n"
                + "TOTAL NO. OF TRANSACTION: " + transactions + "\n";
        if (name != null && !name.trim().isEmpty()) receipt += "OPERATOR: " + name.trim() + "\n";

        JOptionPane.showMessageDialog(null, receipt, "Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    // buildHeader(): build and return the multi-line header listing cities
    private String buildHeader() {
        StringBuilder sb = new StringBuilder("HIJK POSTAL SERVICES\nROXAS BOULEVARD, MANILA\n\nCITIES:\n");
        for (int i = 1; i < CITIES.length; i++) sb.append(i).append(" - ").append(CITIES[i].name).append("  ").append((int) CITIES[i].charge).append("\n");
        return sb.toString();
    }
}