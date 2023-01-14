package Shapes;

import features.Shape;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    @Override
    public void calculateArea(float length, float breath) {
    area = length*breath;
    }
}