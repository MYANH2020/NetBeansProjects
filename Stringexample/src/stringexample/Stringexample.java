/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexample;

/**
 *
 * @author anhhuynh
 */
public class Stringexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Rock";
        String str2 = "Star";
        //String str3 = str1.concat(str2);
        //System.out.println(str3);
        String str4 = str1 + str2;
        System.out.println(str4);
        System.out.println(str4.length());
        System.out.println("the character at position 5 is: "+ str4.charAt(5));
        System.out.println("the position of character 'S' is: "+ str4.indexOf('S'));
        System.out.println("compare to 'RockStar' case ignore: "+ str4.compareToIgnoreCase("many"));
        System.out.println(" contains sequence 'ck': "+str4.contains("ck"));
        System.out.println(" EndsWith character 'r': "+str4.endsWith("r"));
        System.out.println(" replace 'Rock' by 'Duke': " + str4.replaceFirst("Rock", "Duke"));
        System.out.println("replace 'Rock' by 'fog': "+ str4.replace("Rock", "fog"));
        System.out.println(" Convert to LowerCase: "+ str4.toLowerCase());
         System.out.println(" Convert to UpperCase: "+ str4.toUpperCase());
        // TODO code application logic here
    }
    
}
