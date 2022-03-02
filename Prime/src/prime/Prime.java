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
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbs={ 123, 24, 53, 78};
        for( int i=0; i<numbs.length;i++){
            if(Factors.isPrime(numbs[i])){
                System.out.println(numbs[i]+" is prime");
            }
        }
        
        
        // TODO code application logic here
    }
    public boolean isPrime(int number){
        return Factors.countFactors(number)==2;
    }
    
    }
    

