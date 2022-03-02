/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author anhhuynh
 * 
 */
 class Exercise1Modified {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(HTMLHeader);
        File para1 = null;
        if (0< args.length){
            para1 = new File(args[0]);
        }
        else {
            System.out.println("Invalid arguments count: + args.length");
        }
        BufferedReader lineIn = null;
        try {
            String currentLine;
            lineIn = new BufferedReader( new FileReader("para1.txt"));
            currentLine = lineIn.readLine();
            while (currentLine != null){
                
                System.out.println (" <tr><td>" + currentLine + "</td></tr>");
                currentLine = lineIn.readLine();
            }
            System.out.println(HTMLFooter);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    // HTML
    private static final String HTMLHeader = 
           "<!DOCTYPE html>\n"
        + "  <html>\n"
        + "    <head>\n"
        + "     <title>CSE-278: Exercise 1</title>\n"
        + "    </head>\n"
        + "  <body>\n"
        + "    <table border=1>";
  
    private static final String HTMLFooter =
            " </table>\n"
           + "</body>\n"
            +"</html>";


            
}
