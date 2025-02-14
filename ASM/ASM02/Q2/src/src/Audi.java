/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Audi extends Vehicle {

    private int releasedYear;
    private String color;

    public Audi() {
        super("", "", 0, 0);
        setReleasedYear(0);
        setColor("");
    }

    public Audi(String id, String name, double price, int quantity, String color, int releasedYear) {
        super(id, name, price, quantity);
        setReleasedYear(releasedYear);
        setColor(color);
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        if (releasedYear < 2022 || releasedYear > 2025) {
            this.releasedYear = 2022;
            return;
        }
        this.releasedYear = releasedYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Black") || color.equals("White") || color.equals("Red") || color.equals("Gray")) {
            this.color = color;
        } else {
            this.color = "Black";
        }
    }

    @Override
    public String toString() {
        return getId()+","+
                getName()+","+
                getColor()+","+
                getReleasedYear()+","+
                String.format("%.2f", getPrice())+","+
                getQuantity()+","+
                String.format("%.2f", getSubTotal());
    }

    @Override
    public double getSubTotal() {
        int x = 100;
        if (this.color.equals("Red") || this.releasedYear == 2025) {
            x = 120;
        }
        return getPrice() * getQuantity() * x / 100;
    }

}
