package Lab3;
import java.util.function.Function;
public class FunctionJavaUtil3 {
    public static void main(String[] args) {
        // Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        // INSERT CODE TO TRIPLE THE VALUE OF THE HALF FUNCTION
        half = half.compose(a -> a * 3);

        // Applying the function to get the result
        System.out.println(half.apply(5));

    }
}
