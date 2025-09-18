package Activity2;
public class ActivityNo1 {
    public static void main(String[] args) {
        // given dollar value and peso to convert
        double dollarValue = 50.75;
        double pesoToConvert = 4;
        System.out.println("Dollar Amount to convert: $4");
        // calculation for peso equivalent
        double pesoEquivalent = pesoToConvert * dollarValue;

        System.out.println("Converted dollar to peso = ₱" + pesoEquivalent);
    }
}