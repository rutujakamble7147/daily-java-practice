package features;

/**
 * This interface defines features for different shape object like circle,square,rectangle,triangle etc.
 * By using this interface the developer wants hide the implementations of the methods of this interface
 * By doing so, full abstraction (method implementation hiding) is achieved.
 * This interface can be share by the developer to other third party developers
 * to write their own shape objects and those shape objects will have their
 * own implementation of these abstract method.
 */




public interface Shape {
    float PI = 3.142f;//public static final float PI = 3.142;
    float calculateArea (int var1, int var2);//method declaration
    void displayArea(int x , int y);//method declaration
}
