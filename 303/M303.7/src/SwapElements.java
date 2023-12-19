import java.util.Arrays;
public class SwapElements {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "green", "purple", "black"};
        System.out.println(Arrays.toString(colors));
        int middleIndex = colors.length/2;
        String temp = colors[0];
        colors[0] = colors[middleIndex];
        colors[middleIndex] = temp;
        System.out.println(Arrays.toString(colors));

    }
}
