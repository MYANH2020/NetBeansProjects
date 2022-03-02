/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author anhhuynh
 */
public class Factors {
    public int countFactors( int numbers){
        int count=0;
        for( int i =1;i<=numbers; i++){
            if( numbers%i==0){
                count ++;
            }
            
        }
        return count;
    }
    
}
