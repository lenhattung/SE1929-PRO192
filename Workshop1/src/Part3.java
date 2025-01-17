
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
public class Part3 {
    public static void main(String[] args) {
        /* String */
        String s = "nGuyEN XuAn SOn";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.length());
        String s1 = s.substring(1);
        System.out.println(s1);
        System.out.println(s.substring(0, 1));
        System.out.println(s.substring(5, 8));
        String[] arr = s.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        /* part 3 */
        int n=3;
        String[] list = new String[n];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("list["+i+"]=");
            sc = new Scanner(System.in);
            list[i]=sc.nextLine();
        }
        
        // process
        for (int i = 0; i < n; i++) {
            list[i] =list[i].trim();
            String[] names = list[i].split(" ");
            for (int j = 0; j < names.length; j++) {
                names[j] = names[j].substring(0,1).toUpperCase()
                        +names[j].substring(1).toLowerCase();
            }
            list[i] = String.join(" ", names);
        }
        
//        Nguyen XUAN sOn
//        kim Sang-sik
//        ngUYEn DInh Trieu
        // output
        for (int i = 0; i < list.length; i++) {
            String string = list[i];
            System.out.println(string);
        }
    }
}
