package Activity7;
import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = scanner.nextLine();

        System.out.print("ENTER YOUR AGE: ");
        int age = scanner.nextInt();

        System.out.print("ENTER YOUR WEIGHT (in pounds): ");
        double weight = scanner.nextDouble();

        System.out.print("ENTER YOUR HEIGHT (in inches): ");
        double height = scanner.nextDouble();

        scanner.nextLine(); // Consume newline

        System.out.print("ENTER YOUR GENDER: ");

        String gender = scanner.nextLine().toLowerCase();

        double bmr;
        //for gender
        if (gender.equals("female")) {
            bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        } else if (gender.equals("male")) {
            bmr = 660 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        } else {
            System.out.println("Choose either male or female and try again");
            scanner.close();
            return;
        }
        System.out.println("YOUR BMR IS: " + bmr);
        System.out.println("\n ENTER YOUR LIFESTYLE:");
        System.out.println("\t1. SEDENTARY (SOMEWHAT INACTIVE)");
        System.out.println("\t2. SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)");
        System.out.println("\t3. ACTIVE (EXERCISE 3-4 DAYS A WEEK)");
        System.out.println("\t4. HIGHLY ACTIVE (EXERCISE EVERYDAY)");
        System.out.print("ENTER YOUR LIFESTYLE: ");
        String lifestyle = scanner.nextLine().toLowerCase();
        double factor;
        switch (lifestyle) {
            case "sedentary (somewhat inactive)":
            case "sedentary":
                factor = 1.2;
                break;
            case "somewhat active (exercise occasionally)":
            case "somewhat active":
                factor = 1.3;
                break;
            case "active (exercise 3-4 days a week)":
            case "active":
                factor = 1.4;
                break;
            case "highly active (exercise everyday)":
            case "highly active":
                factor = 1.5;
                break;
            default:
                System.out.println("Invalid lifestyle.");
                scanner.close();
                return;
        }
        double newBmr = bmr * factor;
        System.out.println("YOUR NEW BMR IS: " + newBmr);
        scanner.close();
    }
}