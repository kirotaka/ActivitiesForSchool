package Activity1;

import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        // for input
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER MEASUREMENT IN INCHES : ");
        double inches = sc.nextDouble();
        //calculation for feet and centimeters
        double feet = inches / 12; 
        double centimeters = inches * 2.54; 
        // print
        System.out.printf("QUIVALENT IN FEET : %.2f\n", feet);
        System.out.printf("QUIVALENT IN CENTIMETERS : %.2f\n", centimeters);
        sc.close();
    }
}

