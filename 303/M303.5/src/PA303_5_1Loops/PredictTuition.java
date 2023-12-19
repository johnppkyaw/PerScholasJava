package PA303_5_1Loops;
public class PredictTuition {
    public static void main(String[] args) {
        final double RATE = 0.07;
        final double INITIAL_TUITION = 10000;
        final double DOUBLE_TUITION = 2 * INITIAL_TUITION;
        int year = 0;
        double currentTuition = INITIAL_TUITION;
        while(currentTuition < DOUBLE_TUITION) {
            currentTuition += currentTuition * RATE;
            year++;
        }
        System.out.println("The tuition will be doubled in " + year + " years!");
    }
}
