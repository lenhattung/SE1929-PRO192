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
        Shape s1 = new Circle(50, 50, 30);
        
        System.out.println(s1.area());
        
        Shape s2 = new Square(1, 1,10);
        System.out.println(s2.area());
        
        Square s = new Square(1, 1, 10);
        System.out.println(s.area());
        
        
        Shape s3 = new Shape(0, 0) {
            @Override
            public double area() {
                return 0;
            }
        };
    }
}
