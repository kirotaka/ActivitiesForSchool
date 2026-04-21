package OOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner with the name 'sc'
        Scanner sc = new Scanner(System.in);

        // --- Create First Student ---
        Student student1 = new Student();
        System.out.println("--- Enter details for Student 1 ---");
        System.out.print("Enter Name: ");
        student1.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        student1.setAge(sc.nextInt());

        System.out.print("Enter Grade: ");
        student1.setGrade(sc.nextInt());

        // Consume the leftover newline character before reading the next String
        sc.nextLine();

        // --- Create Second Student ---
        Student student2 = new Student();
        System.out.println("\n--- Enter details for Student 2 ---");
        System.out.print("Enter Name: ");
        student2.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        student2.setAge(sc.nextInt());

        System.out.print("Enter Grade: ");
        student2.setGrade(sc.nextInt());

        // --- Display Details ---
        System.out.println("\n=== Student Records ===");
        student1.displayDetails();
        student2.displayDetails();

        // Close the scanner
        sc.close();
    }
}