package Activity4;
/* Write a program that checks the value of a variable called temperature. Then display
the following messages depending on the value assigned to the temperature variable.
Temperature Remarks
Less than zero ICE
Between 0 and 100 WATER
Exceeds 100 STEAM  */
public class Act4 {
    public static void main(String[] args) {
        int temperature = 101; // You can change this value to test different cases
        if (temperature < 0) {
            System.out.println("ICE");
        } else if (temperature <= 100) {
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }
        // String result = (temperature < 0) ? "ICE" : (temperature <= 100 ? "WATER" : "STEAM");
        // System.out.println(result);
    }
}
