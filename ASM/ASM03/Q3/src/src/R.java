/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class R {
    public static void main(String[] args) {
        // XXxxx
        // [0-9] hoac \\d
        String regex = "[a-zA-Z]{2}\\d{3}";
        
        String s1 = "AB123";
        String s2 = "123AB";
        System.out.println(s1.matches(regex));
        System.out.println(s2.matches(regex));
        
        // xxXX-xxx.xx
        
        String bienso_regex = "\\d{2}[A-Z]{2}\\-\\d{3}\\.\\d{2}";
        String b1 = "59AD-123.45";
        String b2 = "59AD-12345";
        System.out.println(b1.matches(bienso_regex));
        System.out.println(b2.matches(bienso_regex));
    }
            
}
