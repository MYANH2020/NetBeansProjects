/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexample;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author anhhuynh
 */
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printStars(6);
        //System.out.println();
        //int a= mystery(648);
        //System.out.println(a);
        //System.out.println(pow(3,4));
        //printBinary(6);
        Scanner console= new Scanner(System.in);
        System.out.println( " please enter a file name");
        String name=console.next();
        File f= new File(name);
        if(f.exists()){
            print(f);
        }
        
        // TODO code application logic here
    }
    public static void print(File file){
        System.out.println(file.getName());
        if(file.isDirectory()){
            for(File subF: file.listFiles()){
                print(subF);
                
            }
        }
        
    }
    public static void printStars(int n){
        if (n==1){
            // base case
            System.out.print("*");
        }
        else{
            System.out.print("*");
            printStars(n-1);
        }
    }
    
    public static int mystery( int n){
        if(n<10){
            return n;
        }
        else {
            int a=n/10;
            int b=n%10;
            return mystery(a+b);
        }
    }
    public static int pow(int base, int exponent){
        if(  exponent==0){
            return 1;
            
        }
        else if(exponent %2==0) {
            return pow(base*base, exponent/2);
        }
        else{
            return base*pow(base, exponent-1);
        }
    }
    public static void printBinary(int n){
        if (n<2){//it is 0 or 1
            //base case
            System.out.print(n);
        
    } else {
            printBinary(n/2);
            printBinary(n%2);
        }
    }
    
    
    
}
