package Shapes;

import features.Shape;

public class Square  extends Shape {
    public Square(){
        super();
    }

    @Override
    public void calculateArea(float length , float breath) {
        area =length*breath ;

    }
}

