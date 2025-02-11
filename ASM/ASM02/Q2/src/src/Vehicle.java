/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Vehicle {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Vehicle() {
        setId("");
        setName("");
        setPrice(0);
        setQuantity(0);
    }

    public Vehicle(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty() || id.length() != 7) {
            this.id = "V000000";
            return;
        }
        id = id.toUpperCase();
        if (!id.startsWith("V")) {
            this.id = "V000000";
            return;
        }
        for (int i = 1; i <= 6; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                this.id = "V000000";
                return;
            }
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 5 || name.length() > 50) {
            this.name = "new vehicle";
            return;
        }

        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 1 || price > 1000000) {
            this.price = 1;
            return;
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1 || quantity > 1000) {
            this.quantity = 1;
            return;
        }
        this.quantity = quantity;
    }

}
