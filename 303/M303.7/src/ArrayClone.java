import java.util.Arrays;
public class ArrayClone {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] clonedArr = colors.clone();
        System.out.println(Arrays.toString(clonedArr));
    }
}
