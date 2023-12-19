import java.util.Scanner;
public class FavoriteThings {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        size = input.nextInt();
        String[] favorites = new String[size];
        for (int i = 0; i < favorites.length; i++) {
            System.out.print("Enter your thing: ");
            favorites[i] = input.next();
        }
        input.close();
        System.out.println("Your favorite things are: ");
        for (String favorite:favorites) {
            System.out.print(favorite + " ");
        }
    }
}
