/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Box extends Rectangle {

    private int height = 0; // additional data

    public Box() {
        super();
    }

    public Box(int l, int w, int h) {
        super(l, w); // Try swapping these statements
        height = h > 0 ? h : 0;
    }

    // Additional Getter, Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Overriding methods
    public String toString() {
        return "[" + getLength() + ","
                + getWidth() + "," + getHeight() + "]";
    }

    public int area() {
        int l = this.getLength();
        int w = this.getWidth();
        int h = this.getHeight();
        return 2 * (l * w + w * h + h * l);
    }

    // additional method
    public int volumn() {
        return this.getLength() * this.getWidth() * height;
    }
}
