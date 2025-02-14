
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
public class Main3 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        try {
            a = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Input b:");
        try {
            b = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
                
        }

        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);

    }
}
