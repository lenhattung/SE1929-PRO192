
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class FoodProduct {

    private String code;
    private String name;
    private String manufacturer;
    private double price;
    private Date date;
    private Date expiredDate;

    public FoodProduct() {
    }

    public FoodProduct(String code, String name, String manufacturer, double price, Date date, Date expiredDate) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
        this.expiredDate = expiredDate;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" + "code=" + code + ", name=" + name + ", make=" + manufacturer + ", price=" + price + ", date=" + date + ", expiredDate=" + expiredDate + '}';
    }

}
