/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicelab3binarysearchslide20;

/** 
 *
 * @author anhhuynh
 */
public class PracticeLab3BinarySearchslide20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a={-4, -1, 2, 3, 4, 5, 6, 8, 11, 14, 22, 29, 31, 37, 56};
        for( int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
            int target= 22;
            int b=binarySearch(a,target );
            if (b==-1){
                System.out.println(" the target is not in the list");
            }
            else {
                System.out.println(" The target's position is: "+b);
        }
    }
        public static int binarySearch(int[] a, int target){
       return  binarySearch(a, target, 0, a.length-1);   
        }
        private static int binarySearch( int[] a, int target, int min, int max){
           if (min>=max){
               return -1;
               
           }
           else {
            int mid= (min + max)/2;
            if (a[mid]>target){
                return binarySearch(a,target, min, mid-1 );
            }
            else if(a[mid]< target){
                return binarySearch(a, target, mid+1, max);
            }
            else 
                return mid;
            
               
           }
        }
        
        // TODO code application logic here
    
    
}
