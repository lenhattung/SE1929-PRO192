
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
public class FoodProduct extends Product{
    private Date date;
    private Date expiredDate;

    public FoodProduct() {
    }

    public FoodProduct(String code, String name, String manufacturer, double price, Date date, Date expiredDate) {
        super(code, name, manufacturer, price);
        this.date = date;
        this.expiredDate = expiredDate;
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
        return super.toString() +", "+ date+", "+expiredDate;
    }
}
