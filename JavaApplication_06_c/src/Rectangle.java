/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Rectangle {

    private int length = 0;
    private int width = 0;

    // Overloading constructors
    public Rectangle() // Default constructor
    {
    }

    public Rectangle(int l, int w) {
        length = l > 0 ? l : 0;
        width = w > 0 ? w : 0;
    }

    // Overriding the toString method of the java.lang.Object class
    public String toString() {
        return "[" + getLength() + "," + getWidth() + "]";
    }

    // Getters, Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }
    
}
