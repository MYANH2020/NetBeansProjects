/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author anhhuynh
 */
public class SortingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words={"foo", "bar", "baz", "ball"};
        Arrays.sort(words);
        System.out.print(Arrays.toString(words));
        List<String> words2= new ArrayList<String>();
        for( String word : words){
            words2.add(word);
        }
        Collections.sort(words2);
        System.out.println( words2);
        int[] numbers={22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        // TODO code application logic here
    }

    public static void selectionSort(int[] numbers) {
        for( int i=0; i<numbers.length-1; i++){
            int min=i;
            for( int j=i+1; j<numbers.length; j++){
                if( numbers[j]<numbers[min]){
                    min=j;
                
            }
        }
            swap(numbers, i, min);
        
    }
    }
        public static void swap( int[] numbers, int i,int j){
            if( i!=j){
                
                int temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
            }
        }
}
            
    

