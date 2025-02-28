/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Coffee extends Beverage {

    private int expire;
    private String type;

    public Coffee() {
        super("", "", 0, 0);
        setExpire(0);
        setType("");
    }

    public Coffee(String id, String name, double price, int quantity, String type, int expire) {
        super(id, name, price, quantity);
        setExpire(expire);
        setType(type);
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        boolean check = (expire >= 1 && expire <= 180);
        this.expire = check ? expire : 180;
    }

    public String getType() {
        return toTitleCase(type);
    }

    public void setType(String type) {
        if (type != null && (type.equals("special")
                || type.equals("high")
                || type.equals("medium")
                || type.equals("low"))) {
            this.type = type;
        } else {
            this.type = "medium";
        }
    }

    @Override
    public double subTotal() {
        double rate = 1;
        if (type.equals("special") || getId().startsWith("DB")) {
            rate = 1.2;
        }
        if (type.equals("high") || getId().startsWith("HC")) {
            rate = 1.1;
        }
        if (type.equals("medum") && expire <= 30) {
            rate = 0.5;
        }
        return getPrice() * getQuantity() * rate;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getType() + "," + getExpire() + "," + String.format("%.3f", getPrice()) + "," + String.format("%.3f", subTotal());
    }

}
