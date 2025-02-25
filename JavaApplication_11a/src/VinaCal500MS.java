/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class VinaCal500MS implements ICalculator, ISort{

    @Override
    public double add(int a, int b) {
        return b+a;
    }

    @Override
    public double substract(int a, int b) {
        return a-b;
    }

    @Override
    public double sqr(double x) {
        return Math.pow(x, 2);
    }

    @Override
    public void sortAsc() {
        System.out.println("ASC");
    }

    @Override
    public void sortDesc() {
        System.out.println("DESC");
    }

    @Override
    public void x() {
        System.out.println("x");
    }
    
    
    
}
