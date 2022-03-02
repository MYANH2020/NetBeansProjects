/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicelab3arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author anhhuynh
 */
public class PracticeLab3ArrayString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strings={"a", "b", "f", "z", "g", "t"};
        Arrays.sort(strings);
        System.out.print(Arrays.toString(strings));
        String[] a= {" sugar", "ice", " chat", " tip"};
        System.out.println();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String[] b= {" sugar", "link"};
        System.out.println(Arrays.toString(b));
         List<String> list= new ArrayList<String>();
         list.add("sugar");
         list.add("rice");
         list.add("very");
         Collections.sort(list);
         System.out.println(list);
         
        
        // TODO code application logic here
    }
    
    
}
