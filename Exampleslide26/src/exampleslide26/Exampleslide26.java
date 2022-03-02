/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleslide26;

import java.util.ArrayList;

/**
 *
 * @author anhhuynh
 */
public class Exampleslide26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList< String> list1 = new ArrayList< String>();
        
        
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(1);
        System.out.println(list);
        list1.add("bill");
        list1.add("candy");
        list1.add("cat");
        list1.add("luxy");
        list1.add("data");
        list1.add("lucky");
        removeOdds(list);
        
        System.out.println(list);
        markLength3(list1);
        System.out.println(list1);
    }
    public static void removeOdds( ArrayList<Integer> list)
    {
        int index = 0;
        while ( index< list.size())
        {
            if(list.get(index)% 2 ==1)
            {
                list.remove(index);
                index --;
            }
        
        index ++;
        }
        
            
         //public static void removeOdds( ArrayList<Integer> list){
            // for( int i = 0; i<list.size();i++){
             // int n = list.get(i);
             // if( n% 2 == 1)
             // {
                 // list.remove(i);
                 // i--;
              
              
             
         }
    public static void markLength3( ArrayList<String> list1)
    {
        for ( int index = 0; index < list1.size(); index ++)
        {
            if (list1.get(index).length()==3)
            {
            list1.add(index,"***");
            index++;
        }}
        
        
    }
    
         
            
        }
            
        
        
       // ArrayList<Integer> list1 = new ArrayList< Integer> ();
       // ArrayList< Integer> list2 = new ArrayList< Integer> ();
        
        // TODO code application logic here
    

    
            
            
            
        
        
        
       // ArrayList<Integer> list1 = new ArrayList< Integer> ();
       // ArrayList< Integer> list2 = new ArrayList< Integer> ();
        
        // TODO code application logic here
    
    

