/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Test_1 {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1);
        
        Student s2 = new Student("SE002", "Nguyen Van A",2005, "Tp. HCM");
        System.out.println(s2);
        
        System.out.println("Tên của sv1 : " + s1.getName());
        System.out.println("Tên của sv2 : " + s2.getName());
        
        s1.setName("Xuan Son Nguyen");
        System.out.println(s1);
        s1.setName("");
        System.out.println(s1);
        s1.setbYear(2005);
        System.out.println(s1);
        s1.setbYear(-1);
        System.out.println(s1);
        
        // s1.get
    }
}
