/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author anhhuynh
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int [] array ={ -4, 2, 7,9, 15,19,25,28, 30, 36, 42, 50, 56, 68, 85, 92};
        binarySearch(array);
        
       
    }
    public static int binarySearch( int [] a, int target){
        return binarySearch( a, target, 0,a.length);
    }
    private static int binarySearch1( int[] a, int target, int min, int max){
        
        
    }
    
}
