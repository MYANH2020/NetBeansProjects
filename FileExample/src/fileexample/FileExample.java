/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anhhuynh
 */
public class FileExample {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
      ArrayList< Integer> numbers = new ArrayList<Integer>();
      ArrayList<String> list = new ArrayList<String>();
      list.add("book");
      list.add("pen");
      list.add("sugar");
      
       Scanner input = new Scanner( new File( "data.txt"));
       while (input.hasNextInt())
       { int n = input.nextInt();
       numbers.add(n);
       
       }
       System.out.println(numbers);
       filterEvens(numbers);
       System.out.println(numbers);
       addStars(list);
////       System.out.println(list);
       removeStars(list);
       System.out.println(list);
        // TODO code application logic here
    }

    public static void filterEvens(ArrayList<Integer> list) {
        for( int i = list.size()-1; i>=0; i--)
        { int n = list.get(i);
        if (n %2 == 0)
        { list.remove(i);
        }
        }
    }
    public static void addStars( ArrayList<String> list){
        for( int i = 1; i<= list.size(); i +=2)
        { list.add(i, "*");
        }
        
    }
    public static void removeStars( ArrayList<String> list)
    {
        for ( int i = 1; i< list.size(); i++)
        {
            list.remove(i);
        }
    }
    
        //To change body of generated methods, choose Tools | Templates.
    
    
}
