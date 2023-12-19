package GL303_5_2WhileLoop;
import java.util.Scanner;
public class LoopWithSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, inputNum;

        do {
            System.out.println("Enter an int value (the program will exit if input is 0): ");
            inputNum = input.nextInt();
            sum += inputNum;
        } while (inputNum != 0);

        System.out.println("The sum is " + sum);
        input.close();
    }
}
