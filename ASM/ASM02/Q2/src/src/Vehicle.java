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
        return toTitleCase2(name);
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

    public String toTitleCase(String s) {
        if (s != null) {
            s = s.trim(); // xoa khoang trang 2 dau
            String[] temp = s.split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (!temp[i].isEmpty()) {
                    String word = temp[i];
                    word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    temp[i] = word;
                }
            }
            s = String.join(" ", temp);
            while (s.indexOf("  ") >= 0) { // Tim vi tri cua 2 khoang trang ke nhau
                s = s.replaceAll("  ", " "); // Replace "  " => " "
            }
        }
        return s;
    }

    public String toTitleCase2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        s = s.trim().replaceAll("\\s+", " "); // xóa khoảng trắng thừa

        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return result.toString().trim(); // xóa khoảng trắng cuối cùng
    }
    
    public double getSubTotal(){
        return this.price*this.quantity;
    }
    
    @Override
    public String toString() {
        return id + ", " + getName() + ", " + String.format("%.2f",price) + ", " + quantity + ", "+String.format("%.2f",getSubTotal());
    }
    
    
}
