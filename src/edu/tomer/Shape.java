package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Shape {
    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

//    @Override
//    public String toString() {
//        return "Shape: Width:" +getWidth() +" " + "Height: " + getHeight();
//    }


    @Override
    public String toString() {
        return "Shape:" +
                "width=" + width +
                ", height=" + height;
    }

    //methods:
    public void print(){
        System.out.println(toString());
    }


    //Getters and setters (alt + insert)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
