package PA303_4_1ControlFlow;
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number score: ");
        int score = input.nextInt();
        input.close();
        if(score < 0 || score > 100)
            System.out.println("Score out of range");
        else if(score >= 90)
            System.out.println("A");
        else if(score >= 80)
            System.out.println("B");
        else if(score >= 70)
            System.out.println("C");
        else if(score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
