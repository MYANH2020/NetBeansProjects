/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicestring;

/**
 *
 * @author anhhuynh
 */
public class PracticeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "hello";
        for ( int i = 0; i<s1.length(); i++){
            System.out.println(" character at position "+i+ ": "+ s1.charAt(i));
        }
        String s2 ="how are you?";
        System.out.println(s2.substring(8, 12));
                System.out.println(s2.substring(0));
                verse("wheels", "go", "round and round");
                   verse("wipers", "go", "swish, swish, swish");
                      verse("horn", "goes", "beep beep beep");
    }
    public static void verse( String item, String verb, String sound){
        System.out.println(" The " + item + " on the bus "+ verb +" "+ sound +", ");
         System.out.println( sound + ", ");
         System.out.println( sound + ", ");
         System.out.println(" The " + item + " on the bus "+ verb +" "+ sound +", ");
          System.out.println( " All through the town  ");
          System.out.println();
          
        // TODO code application logic here
    }
    
}
