public class OutOfBound {
    public static void main(String[] args) {
        int[] numbers = {15, 25, 31, 48, 59};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);
//        System.out.println(numbers[numbers.length]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 5 out of bounds for length 5
        //	at OutOfBound.main(OutOfBound.java:6)
        numbers[numbers.length] = 44;
    }
}
