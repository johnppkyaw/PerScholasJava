public class Triangle extends Shape implements Moveable{
    private int x, y;
    public Triangle(){}
    public Triangle(String color) {
        super.color = color;
    }
    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        super.base = base;
        super.height = height;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return 0.5*super.base * super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," +
                super.toString() + "]";
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
