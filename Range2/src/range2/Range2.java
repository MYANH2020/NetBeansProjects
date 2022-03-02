/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package range2;

/**
 *
 * @author anhhuynh
 */
public class Range2 {

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
        int max= numbers[0];
        int min= max;
        for( int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
            
            
        }
        return max- min;
    }
    
}
