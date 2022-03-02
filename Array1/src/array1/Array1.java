/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.ArrayList;

/**
 *
 * @author anhhuynh
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rice");
        list.add("sugars");
        list.add("tea");
        String s= list.get(0);
        System.out.println(list);
        System.out.println(s);
        for( int i=list.size()-1; i>=0;i--){
             System.out.println(list.get(i));
           
        }
        for( int i=0; i<list.size();i++){
            if(list.get(i).startsWith("r")){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
        for( int i=0;i<list.size();i++){
            if(list.get(i).endsWith("s")){
                list.set(i, list.get(i).toUpperCase());
            }
            
        }
        System.out.println(list);
        for ( int i =0; i<list.size();i++){
            if( list.get(i).endsWith("S")){
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
            
        
        
        
        // TODO code application logic here
    }
    
}
