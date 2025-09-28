package Activity4;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        // scanner in
        Scanner sc = new Scanner(System.in);
        // input
        int nm = sc.nextInt();
            // condition
            if (nm <= -1) {
                System.out.println("NEGATIVE");
            }else if (nm >= 1) {
                System.out.println("POSITIVE");
            } else {
                System.out.println("INVALID NUMBER");
            }
    }
}



