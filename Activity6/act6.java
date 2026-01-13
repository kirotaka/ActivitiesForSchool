package Activity6;
import java.util.Scanner;
public class act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        double weightInPounds = sc.nextInt();

        System.out.println("Enter your height in feet followed");
        System.out.println("By a space then additional inches:");
        int feet = sc.nextInt();
        int inches = sc.nextInt();

        //convert pounds to kg
        double kilogram = weightInPounds / 2.2;

        //convert height to inches then to meter
        double totalInches = (feet * 12) + inches;
        double heightMeters = totalInches * 0.0254;

        //computes bmi
        double bmi = kilogram / (heightMeters * heightMeters);

        System.out.println(bmi);

        if (bmi <  18.5)
            System.out.println("Your risk category is Underweight");
        else if (bmi <  25) {
            System.out.println("Your risk category is Normal Weight");
        }
        else if (bmi <  30) {
            System.out.println("Your risk category is Overweight");
        }
        else  {
            System.out.println("Your risk category is Obese");
        }
    }
}
