
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
public class Test {
    public static void main(String[] args) {
        ElectronicProduct ep = new ElectronicProduct("LT01", "LG Gram 2in1", "LG", 34000000, "2 years", "220V", "1000w");
        System.out.println(ep);
        System.out.println(ep.getPrice());
        
        System.out.println("");
        CeramicProduct cp = new CeramicProduct("BS01", "Binh su THAI CONG", "FRANCE-1", 10000000, "Binh cam hoa");
        System.out.println(cp);
        System.out.println(cp.getName());
        
        
        System.out.println("");
        FoodProduct fp = new FoodProduct("MT01", "Hao Hao Chua Cay", "Acecook", 4000, new Date(System.currentTimeMillis()), new Date(125, 7, 15));
        System.out.println(fp);
        System.out.println(fp.getDate());
        System.out.println(fp.getExpiredDate());
        System.out.println(fp.price);
    }
}
