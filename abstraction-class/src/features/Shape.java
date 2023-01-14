package features;

public abstract class Shape {



    public static final float PI = 3.142f;
    public float area;
    public Shape(){

    }
    public abstract void calculateArea(float x , float y);
    public void displayArea(){
        System.out.println("Area of " + this.getClass().getName() + " is " + area );
    }
    public abstract void calculateArea();

}
