/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package range;

/**
 *
 * @author anhhuynh
 */
public class Range {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers={17, 29, 11, 4, 20, 8};
        int b= range(numbers);
        System.out.println(" the range is: "+b);
        // TODO code application logic here
    }
    public static int range( int[] numbers){
        int maxDiff=0;
        int diff;
        for( int i=0;i<numbers.length;i++){
            for( int j=0; j<numbers.length; j++){
                 diff= Math.abs(numbers[j]-numbers[i]);
                if (diff>maxDiff){
                    maxDiff=diff;
                    
                }
                
            }
            
           
        }
        return diff;
        
        }
          
    
}
