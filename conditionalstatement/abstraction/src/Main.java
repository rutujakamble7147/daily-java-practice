import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Traingle;
import features.Shape;

public class Main {
    public static void main(String[] args) {
       Shape square = new Square();
        System.out.println( " Area of a square = " + square.calculateArea ( 10,10));
       Shape rectangle = new Rectangle();
        System.out.println(" Area of a rectangle = " + rectangle.calculateArea(10,20));
         Shape circle = new Circle();
        System.out.println("Area of a circle = " + circle.calculateArea(20,10));
         Shape traingle = new Traingle();
        System.out.println(" Area of a triangle = " + traingle.calculateArea(30,40));


        circle.displayArea(10,30);
        square.displayArea(20,20);
        rectangle.displayArea(20,30);
        traingle.displayArea(20,10);
    }


}