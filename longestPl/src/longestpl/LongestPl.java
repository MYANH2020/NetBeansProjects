/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;



/**
 *
 * @author anhhuynh
 */
public class LongestPl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8)  ;
      BufferedReader in = new BufferedReader(reader);
      String line = in.readLine();
      
      int n = line.length();
    int X=  longestPalindrome( line, 0, n-1);
    System.out.println(X);
      
      
        
        // TODO code application logic here
    }
    public static int longestPalindrome( String line, int i, int j){
        if( i>j) {
            return 0;
        }
        if ( i==j){
            return 1;
        }
        if ( line.charAt(i)== line.charAt(j)){
            return longestPalindrome(line, i+1,j-1) +2;
        }
        return Integer.max(longestPalindrome(line, i,j-1), longestPalindrome(line, i+1,j));
    }
    
}
