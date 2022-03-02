/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccinumber;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author anhhuynh
 */
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    System.out.println(" input the number ");
    String line  = in.readLine();
    int n = Integer.parseInt(line);
    System.out.println(" the result is: " + fib(n));
        
        // TODO code application logic here
    }
    public static int fib( int n){
        int f[] = new int[ n+2];
        f[0] = 0;
         f[1] = 1;
         for ( int i = 2; i <= n; i++){
             f[i] = f[i-1] + f[i-2];
         }
         return f[n];

       
    }
    
}
