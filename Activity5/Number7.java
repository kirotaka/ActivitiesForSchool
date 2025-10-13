package Activity5;
import  java.util.Scanner;
// Write a do-while loop that asks the user to enter two numbers. The numbers should be
//added and the sum displayed. The loop should ask the user whether he or she wishes to
//perform the operation again. If so, the loop should repeat; otherwise it should terminate.
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String YesOrNo;
        boolean terminate = false;

        do {

            System.out.println("Input two Positive Number");
            System.out.print("Enter first Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            if ((num1 < 0) || (num2 < 0)) {
                System.out.println("Invalid Input, Please Use Positive Number");

            } else {

                System.out.println("The sum is " + (num1 + num2));
                System.out.println("Do you wish to perform the operation again. (Y/N) ");
                YesOrNo = sc.next();
                if (YesOrNo.equalsIgnoreCase("Y")) {
                    System.out.println("Continue");
                } else {
                    System.out.println("Program Terminated");
                    terminate = true;
                }
            }
        }

        while (!terminate);


    }
}
