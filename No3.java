import java.util.Scanner;
public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole numbers \nseparated by one or more spaces:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("You entered " + num1 + " and " + num2 + ".");

        System.out.println("Next enter two numbers. \nA decimal point is OK.");
        double dec1 = sc.nextDouble();
        double dec2 = sc.nextDouble();
        System.out.println("You entered " + dec1 + " and " + dec2 + ".");

        System.out.println("Next enter two words:");
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");

        System.out.println("Next enter a line of text:");
        sc.nextLine();  // Consume the leftover newline
        String line = sc.nextLine();
        System.out.println("You entered \"" + line + "\"");

        sc.close();
    }
}
