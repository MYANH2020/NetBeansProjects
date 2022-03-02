/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Arrays;

/**
 *
 * @author anhhuynh
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers={22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        // TODO code application logic here
    }
    public static void selectionSort(int[] numbers) {
        for( int i=numbers.length-1; i>=0; i--){
            int max=i;
            for( int j=0; j<i; j++){
                if( numbers[j]>numbers[max]){
                    max=j;
                
            }
        }
            swap(numbers, i, max);
        
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
