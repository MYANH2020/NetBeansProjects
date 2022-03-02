/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestprefix;

/**
 *
 * @author anhhuynh
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class LongestPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String sentence1 = " this test is hard.";
        String sentence2 = " try all your best";
        sentence1 = sentence1 + sentence2;
        System.out.println(sentence1);
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String numbers = in.readLine();
    String prefixes = in.readLine();
    //String[] numbers = { "+432112345", "+9990", "+4450505" };
     //   String[] prefixes = { "+4321", "+43211", "+7700", "+4452", "+4" };
        String max;
        //for (String number : numbers) {
            max = "";
          //  for (String prefix : prefixes) {
                if (numbers.startsWith(prefixes)) {
                    if (max.length() < prefixes.length()) {
                        max = prefixes;
                    }
                }
            
            System.out.println(numbers + " matches with the longest prefix " + max);
        }
    }

    
     //  System.out.println(way_decode(line));
    


        
        // TODO code application logic here
    
    

