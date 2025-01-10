/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Ex02c {
    public static void main(String[] args){
        boolean check = 5>=4;
        System.out.println(check);
        
        check = ((5>=4)&&(15%2==0));
        System.out.println(check);
        
        // (condition)?op1:op2;
        int x = 100;
        
        String ketQua = "";
        if (x%2==0){
            ketQua = "chan";
        }else{
            ketQua = "le";                    
        }
        System.out.println(ketQua);
         
        ketQua = (x%2==0)?"chan":"le";
        System.out.println(ketQua);
        
    }
}
