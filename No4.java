public class No4 {
//     A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a
// local grocery store. The cost of producing one liter of milk is $0.38, and the profit of each carton
// of milk is $0.27. Write a program that does the following:
// a. Prompts the user to enter the total amount of milk produced in the morning.
// b. Outputs the number of milk cartons needed to hold milk.
// c. Outputs the cost of producing milk
// d. Outputs the profit for producing milk.
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the total amount of milk produced in liters: ");
        double totalMilk = sc.nextDouble();

        double cartonCapacity = 3.78; // liters
        double costPerLiter = 0.38; // dollars
        double profitPerCarton = 0.27; // dollars

        int numberOfCartons = (int) Math.ceil(totalMilk / cartonCapacity);
        double productionCost = totalMilk * costPerLiter;
        double totalProfit = numberOfCartons * profitPerCarton;

        System.out.println("Number of milk cartons needed: " + numberOfCartons);
        System.out.printf("Cost of producing milk: $%.2f\n", productionCost);
        System.out.printf("Profit for producing milk: $%.2f\n", totalProfit);

        sc.close();
    }
}
