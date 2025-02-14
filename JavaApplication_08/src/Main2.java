
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
public class Main2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a:");
        a = sc.nextInt();
        
        System.out.println("Input b:");
        b = sc.nextInt();
        
        int c = a + b;
        System.out.println(a+"+"+b+"="+c);
        
        /*
        Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextInt(Scanner.java:2117)
	at java.util.Scanner.nextInt(Scanner.java:2076)
	at Main2.main(Main2.java:25)
C:\Users\tungi\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 37 seconds)

        
        => RUNTIME ERROR
        */
    }
}
