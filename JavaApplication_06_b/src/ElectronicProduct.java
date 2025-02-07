/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class ElectronicProduct extends Product{
    private String guaranty;
    private String voltage;
    private String power;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String code, String name, String manufacturer, double price, String guaranty, String voltage, String power) {
        super(code, name, manufacturer, price);
        this.guaranty = guaranty;
        this.voltage = voltage;
        this.power = power;
        
    }

    public String getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
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
        return super.toString() +", "+ guaranty+", "+voltage+", "+power;
    }
}
