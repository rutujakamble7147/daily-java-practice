package Shapes;

import features.Shape;

public class Traingle implements Shape {
    @Override
    public float calculateArea(int x , int y){
        return 0.5f*x*y;
    }
    @Override
    public void displayArea(int x , int y){
        System.out.println(calculateArea(x,y));
    }
}
