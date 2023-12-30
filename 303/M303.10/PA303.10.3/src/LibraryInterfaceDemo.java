
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid1 = new KidUser();
        kid1.age = 10;
        kid1.registerAccount();
        kid1.age = 18;
        kid1.registerAccount();
        kid1.bookType = "Kids";
        kid1.requestBook();
        kid1.bookType = "Fiction";
        kid1.requestBook();
        System.out.println("======================");
        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.registerAccount();
        adult.age = 23;
        adult.registerAccount();
        adult.bookType = "Kids";
        adult.requestBook();
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}