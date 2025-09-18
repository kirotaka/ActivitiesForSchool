package Activity2;
public class ActivityNo10 {
     public static void main(String[] args) {
        double P = 250000; // principal
        double R = 0.12;   // 12% interest
        double T = 30.0 / 360.0; // 30 days in a year basis

        double I = P * R * T; // interest
        double withholdingTax = I * 0.10; // 10%
        double netInterest = I - withholdingTax;

        System.out.println("Withholding Tax: " + withholdingTax);
        System.out.println("Net Interest: " + netInterest);
    }
}