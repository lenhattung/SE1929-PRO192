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
        Rectangle r = new Rectangle(2,5);
        System.out.println("Rectangle: "+r.toString());
        System.out.println("      Area: "+r.area());
        
        Box b = new Box(2,2,2);
        System.out.println("Box: "+b.toString());
        System.out.println("      Area: "+b.area());
        System.out.println("      Volumn: "+b.volumn());
        
        
        Rectangle r2 = new Box(3,3,3);
        System.out.println("Rectangle: "+r2.toString());
        System.out.println("      Area: "+r2.area());
        //System.out.println("      Volumn: "+r2.volumn()); 
        
    }
}
