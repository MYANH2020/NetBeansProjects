/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3.cau3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author anhhuynh
 */
public class Homework3Cau3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        set.add(74);
        set.add(12);
        set.add(182);
        set.add(90);
        set.add(40);
        System.out.println(set);
        boolean a= hasOdd(set);
        System.out.println(" Does this set has Odd number? "+ a);
        
        
        // TODO code application logic here
    }
    public static boolean hasOdd( Set<Integer> set){
        Iterator<Integer> iter= set.iterator();
        while( iter.hasNext()){
            if(iter.next()%2!=0){
                return true;
            }
            
            
        }
        return false;
        
    }
    
}
