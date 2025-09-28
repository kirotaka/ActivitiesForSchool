package Activity4;

import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        // scanner in
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        //  condition
        if (num % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}

