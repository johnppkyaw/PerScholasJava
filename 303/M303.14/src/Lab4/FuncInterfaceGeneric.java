package Lab4;

public class FuncInterfaceGeneric {
    public static void main(String[] args) {
        // Declare a reference to the IValue functional interface
        // that will operate on the Float type
        IValue<Float> refIValue;
        // Set a lambda expression with reference to the type Float
        refIValue = () -> 3.1415f; // return the value of float type
        // Invoke method GetValue(), which returns 3.1415f
        float v = refIValue.GetValue(); // v = 3.1415
        System.out.println("v = " + v);
    }
}
