/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Ex02b {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println((double)a/b);
        
        //
        System.out.println("");
        int x = 5;
        System.out.println(x++);// 5   
        System.out.println(++x);// 7
        System.out.println(--x);// 6
        System.out.println(x--);// 6
        
        //
        System.out.println("");
        int y = 5;
        int z = 4;
        System.out.println(y++ - ++z); //0
        System.out.println(y); // 6
        System.out.println(z); // 5
        
    }
}
