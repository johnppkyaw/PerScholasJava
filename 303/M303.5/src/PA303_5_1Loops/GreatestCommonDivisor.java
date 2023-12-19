package PA303_5_1Loops;
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, gCD = 1;
        int k = 1;
        System.out.println("Enter the first positive integer: ");
        num1 = input.nextInt();
        System.out.println("Enter the first positive integer: ");
        num2 = input.nextInt();
        while(num1 > k || num2 > k) {
            if(num1 % k == 0 && num2 % k == 0) {
                gCD = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor of " + num1 + " and " +
                num2 + " is: " + gCD);
    }
}
