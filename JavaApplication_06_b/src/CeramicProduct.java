/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class CeramicProduct extends Product {

    private String type;

    public CeramicProduct() {
    }

    public CeramicProduct(String code, String name, String manufacturer, double price, String type) {
        super(code, name, manufacturer, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        //return getCode() + ", " + getName() + ", " + getManufacturer() + ", " + price +", "+ type;
        return super.toString() +", "+ type;
    }
}
