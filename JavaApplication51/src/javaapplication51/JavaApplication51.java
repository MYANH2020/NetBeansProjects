/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


/**
 *
 * @author anhhuynh
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
      System.out.println("in put the word: ");
    String line = in.readLine();
  
   String str[] = line.split(" "); 
   for(String str1: str)
   {
   String str2 = str1.substring(0, 1).toUpperCase(); 
String str3 = str2 + str1.substring(1); 
System.out.print(str3 + " "); 
   }
  
   }
  
    
        // TODO code application logic here
    
    
}
