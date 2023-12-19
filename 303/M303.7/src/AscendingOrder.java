import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 13, 1, 0};
        Arrays.sort(numbers);
        int smallest = numbers[0];
        int biggest = numbers[numbers.length - 1];
        System.out.print("Array in ascending order: ");
        for(int i = 0; i < numbers.length; i++) {
            if(i == numbers.length - 1) System.out.print(numbers[i] + "\n");
            else
                System.out.print(numbers[i] + ", ");
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The biggest number is " + biggest);
    }
}
