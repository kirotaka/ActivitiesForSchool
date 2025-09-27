import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of eggs: ");
        int eggsPerBasket = sc.nextInt();

        System.out.println("Enter the number of baskets: ");
        int numberOfBaskets = sc.nextInt();

        int totalEggs = eggsPerBasket * numberOfBaskets;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs + ".");
        // Taking two eggs out of each basket
        eggsPerBasket -= 2;
        totalEggs = eggsPerBasket * numberOfBaskets;

        System.out.println("Now we take two eggs out of each basket.");
        System.out.println("Now you have");
        System.out.println(eggsPerBasket + " eggs per baskets and and");
        System.out.println(numberOfBaskets + " baskets.");
        System.out.println("The new total number of eggs is " + totalEggs + ".");
        System.out.println("\nThank you!");
        sc.close();
        
        }
    }