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
    public static void main(String[] args){
       Student s1 = new Student();
       System.out.println(s1);
       
       Student s2 = new Student("002", "Nguyen Xuan Son", 1997, "Nam Dinh");
       System.out.println(s2);
       
       //s1.name = "";
       //s2.bYear=-1;
       s2.setbYear(-1);
       System.out.println(s2);
       
       s2.setbYear(1998);
       System.out.println(s2);
       
        System.out.println(s2.getName());
    }
}
