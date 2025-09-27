package Activity4;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int divisible = sc.nextInt();
        if (divisible % 5 == 0) {
            System.out.println("DIVISIBLE");
        }
        else {
                System.out.println("NOT DIVISIBLE");
            }
    }
}
