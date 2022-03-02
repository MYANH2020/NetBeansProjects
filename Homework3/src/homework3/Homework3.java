/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anhhuynh
 */
public class Homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        
        set1.add(2);
        set1.add(3);
        set.add(74);
        set.add(12);
        set.add(182);
        set.add(90);
        set.add(43);
        set.remove(74);
        set.remove(999);
        set.remove(43);
        set.add(32);
        set.add(182);
        set.add(9);
        set.add(29);
        
        System.out.print(set);
        System.out.println();
        
        Map<Integer, String> map= new HashMap<Integer, String>();
        map.put(7,"Marty");
        map.put(34,"Louann");
        map.put(27,"Donald");
        map.put(15,"Moshe");
        map.put(84,"Larry");
        map.put(7,"Ed");
        map.put(2350,"Orlando");
        map.remove(8);
        map.put(5,"Moshe");
        map.remove(84);
        map.put(17,"Steve");
        System.out.println(map);
       
        
        
        // TODO code application logic here
    }
   
    
}
