/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void input(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        this.height = sc.nextInt();
        System.out.println("Input material: ");
        sc = new Scanner(System.in);
        this.material = sc.nextLine();
    }
    
    public void output(){
        output();
        System.out.println("Height: "+ this.getHeight());
        System.out.println("Material: "+ this.getMaterial());
    }

    @Override
    public String toString() {
        return "Vase{" + "height=" + height + ", material=" + material + '}';
    }
    
    
}
