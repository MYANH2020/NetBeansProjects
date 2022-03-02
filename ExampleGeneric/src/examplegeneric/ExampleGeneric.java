/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplegeneric;

/**
 *
 * @author fansari
 */
public class ExampleGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderedPair o1 = new OrderedPair(3, 4);
        System.out.println(o1);
        
        /*
        OrderedPair<Integer> o1 = new OrderedPair<Integer>(3, 4);
        System.out.println(o1);
        */
    }
    
}
