
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyRunner{
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Moveable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        System.out.println("--------Test Rectangle-------");
        Moveable r = new Rectangle(10, 15, 10, 10);  // upcast
        System.out.println("Area of Rectangle " + ((Rectangle) r).getArea());
        System.out.println("Coordinates are " + r.getCoordinate());
        r.moveUp();
        System.out.println("After move up , Coordinates are " + r.getCoordinate());

        System.out.println("--------Test Triangle-------");
        Moveable t = new Triangle(1, 5, 20, 20);  // upcast
        System.out.println("Area of Triangle " + ((Triangle) t).getArea());
        System.out.println("Coordinates are " + t.getCoordinate());
        r.moveLeft();
        System.out.println("After move left , Coordinates are " + t.getCoordinate());
    }
}