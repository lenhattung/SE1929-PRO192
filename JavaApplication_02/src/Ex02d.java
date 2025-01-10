/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Ex02d {

    public static void main(String[] args) {
        double a = 5, b = 6, c = 7;
        double delta, x1, x2;

        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phuong trin co nghiem kep x1=x2=" + x1);
        } else {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}
