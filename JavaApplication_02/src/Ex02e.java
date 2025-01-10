
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tungi
 */
public class Ex02e {

    public static void main(String[] args) {
        double a = 0, b, c;
        double delta, x1, x2;
        int check = 1;
        do {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Nhap vao a<>0:");
                a = sc.nextInt();
            } while (a == 0);
            System.out.print("Nhap vao b:");
            b = sc.nextInt();
            System.out.print("Nhap vao c:");
            c = sc.nextInt();

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
            
            System.out.println("Nhap 1 de tiep tuc, nhap 0 de thoat");
            check = sc.nextInt();
        } while (check == 1);
    }
}
