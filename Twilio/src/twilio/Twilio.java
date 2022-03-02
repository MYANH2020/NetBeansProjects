/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twilio;

/**
 *
 * @author anhhuynh
 * 
 */
import java.util.*;
public class Twilio {

    /**
     * @param args the command line arguments
     */
    public static List<String> vanity( List<String> codes, List<String> numbers){
        // declare a list to store result
        List <String> res = new ArrayList<>();
        // iterate through every code and find the numerical code corresponding to them
        for( String code: codes){
            String temp ="";
            for ( int i = 0; i<= code.length(); i++)
                temp = temp + findNumber(code.charAt(i));
            // check if numerical equivalent code is present in any number or not
            for ( String number : numbers)
                if ( number.contains(temp))
                
                res.add(number);
        }
        //sort the list
        Collections.sort(res);
        
    
        return res;
    }
    


    // method to return the number corresponding to given Character
    // e.g: for A, B, or C it should return 2
    // i.e check on which key the given character lies
    public static int findNumber( char ch){
        if ( ch >='A' && ch <= 'C')
            return 2;
        else if ( ch >='D' && ch <= 'F')
            return 3;
        else if ( ch >='G' && ch <= 'I')
            return 4;
        else if ( ch >='J' && ch <= 'L')
            return 5;
        else if ( ch >='M' && ch <= 'O')
            return 6;
        else if ( ch >='P' && ch <= 'S')
            return 7;
        else if ( ch >='T' && ch <= 'V')
            return 8;
        else 
            return 9;
    }
    public static void main(String[] args) {
        List <String> codes = new ArrayList<>();
        codes.add("TWO");
        codes.add("CODE");
        codes.add("HTCH");
        List <String> numbers = new ArrayList<>();
        numbers.add("+17474824380");
         numbers.add("+14157088956");
          numbers.add("+919810155555");
           numbers.add("+15109926333");
            numbers.add("+1415123456");
            List<String> res = vanity(codes, numbers);
            for( String str: res)
                System.out.println(str);
        // TODO code application logic here
    }
    
}
