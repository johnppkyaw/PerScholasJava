package HandsOn;

import java.util.Arrays;

public class MainEntry {
    Calc add = new Calc() {
        @Override
        public int compute(int[] integers) {
            int sum = 0;
            for(int num: integers) {
                sum += num;
            }
            return sum;
        }
    };

    Calc subtract = new Calc() {
        @Override
        public int compute(int[] integers) {
            int result = integers[0];
            for(int num: Arrays.copyOfRange(integers, 1, integers.length + 1)) {
                result -= num;
            }
            return result;
        }
    };

    Calc multiply = new Calc() {
        @Override
        public int compute(int[] integers) {
            int result = 1;
            for(int num: integers) {
                result *= num;
            }
            return result;
        }
    };

    Calc divide = new Calc() {
        @Override
        public int compute(int[] integers) {
            System.out.println("This will only divide the first two numbers.");
            return integers[0] / integers[1];
        }
    };
}
