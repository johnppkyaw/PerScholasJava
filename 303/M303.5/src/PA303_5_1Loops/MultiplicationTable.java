package PA303_5_1Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        final int ROW = 12;
        final int COL = 12;
        for (int i = 1; i <= ROW; i++) {
            for (int j = 1; j <= COL; j++) {
                System.out.print("\t" + i * j);
                if(j == COL) System.out.print("\n");
            }
        }
    }
}
