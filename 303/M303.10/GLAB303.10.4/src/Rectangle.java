public class Rectangle extends Shape implements Moveable{
    private int x, y;
    public Rectangle(String color) {
        super.color = color;
    }

    public Rectangle() {
    }
    public Rectangle(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }

    public Rectangle(int x, int y, double width, double height) {
        this.x = x;
        this.y = y;
        super.height = height;
        super.width = width;
    }
    @Override
    public double getArea() {
        return super.width *  super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle"  );
    }
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" +
                width + "," + super.toString() + "]";
    }

    @Override
    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y--;
    }
    @Override
    public void moveDown() {
        y++;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }

}
