/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class CasioFX580MS implements ICalculator{

    @Override
    public double add(int a, int b) {
       return a+b;
    }

    @Override
    public double substract(int a, int b) {
        return a-b;
    }

    @Override
    public double sqr(double x) {
        return x*x;
    }

    @Override
    public void x() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
