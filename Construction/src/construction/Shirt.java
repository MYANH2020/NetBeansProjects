/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction;

/**
 *
 * @author anhhuynh
 */
public class Shirt {
    private String color;
    private char size;
   public Shirt() {
       System.out.println("inside constructor");
        
    }
    public static void putOn(){
        System.out.println("Shirt is on");
    }
    public static void takeOff(){
        System.out.println("Shirt is off");
        
    }
    
}
