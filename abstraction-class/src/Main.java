import Shapes.Rectangle;
import Shapes.Square;
import features.Shape;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape rectangle = new Rectangle();
        rectangle.calculateArea(10,20);
        rectangle.displayArea();
        square.calculateArea(10,10);
        square.displayArea();

        System.out.println( "area of a + " );
    }
}