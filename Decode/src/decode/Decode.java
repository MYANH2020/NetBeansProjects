/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author anhhuynh
 */
public class Decode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    System.out.println(" what is the message? ");
    String line  = in.readLine();
   System.out.println(" there is/ are: "+way_decode(line)+"  way/ ways to decode the message");
    }
    public static int way_decode( String line){
        int n = line.length();
        if ( line == null || n == 0) {
            return 0;
        }
        int count [] = new int [n+1];
        count[0] = 1;
        if ( line.charAt(0)!= '0'){
            count[1] =1;
        }
        for( int i= 2; i <=n; i++){
          int a = Integer.parseInt(line.substring(i-1,i));
              int b = Integer.parseInt(line.substring(i-2,i));
              if ( a>1 && a<9){
                  count[i]+= count[i-1];
              }
              if ( b>=10 && b <= 26){
                  count[i] += count[i-2];
                  
              }
              
        }
        return count[n];
        
        
    }
                
   
   

        // TODO code application logic here
    

    
}
