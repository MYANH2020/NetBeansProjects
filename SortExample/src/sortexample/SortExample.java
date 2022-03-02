/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortexample;

import java.util.Arrays;

/**
 *
 * @author anhhuynh
 */
public class SortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]a1={3,4,1,5};
        selectionSort(a1);
        System.out.println(Arrays.toString(a1));
        
        // TODO code application logic here
    }
    public static void selectionSort( int[] a){
        // we need the smallest value
        // the outer loop keeps track of each run
        for( int i =0; i<a.length-1;i++){
            // I assume that the smallest value is at index 0
            int smallest =i;
            // the inner for loop keep track of comparing items to find the smallest value
            for( int j=i+1;j<a.length;j++){
                if(a[j]<a[smallest]){
                    smallest=j;
                }
            }
            swap(a,i, smallest);
        }
    }
        public static void swap( int[] a, int i,int j){
            if( i!=j){
                
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        public static void mergeSort( int[] a){
            if(a.length>=2){
                int[] left= Arrays.copyOfRange(a, 0, a.length/2);
                int[] right=Arrays.copyOfRange(a, a.length/2, a.length);
                mergeSort(left);
                mergeSort(right);
            }
            merge(left, right);
        }
        public static void merge( int [] result, int [] left, int [] right){
            int il=0;// il is for left
            int ir=0;// ir is for right
            for( int i=0; i< result.length;i++){
                if( ir>right.length) || (il <left.length&& left[i]<= right[i2])){
                result[i]=left[i];
                il++;
            }
                else {
                        result[i]=right[i2]
                                i2++; 
                }
                
            }

        }
    }
    

