package Algorithm;

public class ActinDsaToledoIvanP {
        public static void main(String[] args) {

            int[][] lamesa = new int[12][20];
            int[] magbilang = new int[12];

            for (int x = 1; x <= 100; x++) {
                int hash = x % 12;
                lamesa[hash][magbilang[hash]] = x;
                magbilang[hash]++;
            }

            for (int i = 0; i < 12; i++) {
                System.out.print("Index " + i + ": ");
                for (int j = 0; j < magbilang[i]; j++) {
                    System.out.print(lamesa[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
