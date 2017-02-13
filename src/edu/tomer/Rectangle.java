package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    public int getArea(){
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle{} " + super.toString() + "Area: " + getArea();
    }

    @Override
    public void print() {
        System.out.println("Rectangle");
        super.print();
        System.out.println("Area: " + getArea());
    }

}
