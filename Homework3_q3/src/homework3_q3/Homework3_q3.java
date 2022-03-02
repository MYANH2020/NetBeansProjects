/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3_q3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anhhuynh
 */
public class Homework3_q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        set.add(3);
        set.add(38);
        set.add(90);
        System.out.println(set);
        boolean b= hasOdd(set);
        System.out.println(" Does the set has odd element? "+b);
        
        // TODO code application logic here
    }
    public static boolean hasOdd( Set<Integer> set){
        for( int value: set){
            if( value%2 !=0 ){
                return true;
            }
            
            
        }
        return false;
    }
    
}
