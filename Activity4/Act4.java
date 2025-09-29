package Activity4;

/*
 * Number 4
 * This program checks the value of a temperature variable and displays
 * the corresponding state of water based on temperature ranges:
 * - Less than 0: ICE
 * - Between 0 and 100: WATER  
 * - Exceeds 100: STEAM
 * 
 * Input: Temperature value (hardcoded as variable)
 * Output: The state of water based on temperature
 */
public class Act4 {
    public static void main(String[] args) {
        // Temperature variable - can be changed to test different cases
        int temperature = 101;
        
        // Determine water state based on temperature ranges
        if (temperature < 0) {
            // Below freezing point
            System.out.println("ICE");
        } else if (temperature <= 100) {
            // Between freezing and boiling point (inclusive)
            System.out.println("WATER");
        } else {
            // Above boiling point
            System.out.println("STEAM");
        }
        
        // Alternative ternary operator implementation (commented out)
        // String result = (temperature < 0) ? "ICE" : (temperature <= 100 ? "WATER" : "STEAM");
        // System.out.println(result);
    }
}
