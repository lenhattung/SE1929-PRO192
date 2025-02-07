/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class ElectronicProduct {
    private String code;
    private String name;
    private String manufacturer;
    private double price;
    private String voltage;
    private String power;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String code, String name, String manufacturer, double price, String voltage, String power) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.voltage = voltage;
        this.power = power;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" + "code=" + code + ", name=" + name + ", make=" + manufacturer + ", price=" + price + ", voltage=" + voltage + ", power=" + power + '}';
    }
    
    
}
