/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Tester {
    public static void main(String[] args) {
        ICalculator c1 = new CasioFX580MS();
        
        VinaCal500MS c2 = new VinaCal500MS();
        
        // ICalculator i = new ICalculator();
        
        ICalculator c3 = new VinaCal500MS();
        
        ISort s1 = new VinaCal500MS();
    }
}
