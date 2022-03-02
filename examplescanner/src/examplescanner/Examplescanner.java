/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplescanner;

import java.util.Scanner;

/**
 *
 * @author anhhuynh
 */
public class Examplescanner {
    public static double p = 3.14;
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the radius1: ");
        int r1= sc.nextInt();
        //Scanner sc2= new Scanner(System.in);
        System.out.println("enter the radius2: ");
        int r2= sc.nextInt();
        double r3 = sc.nextDouble();
        String r4 = sc.nextLine();
        
        
        
        
        System.out.println("Area of circle: " + circle(r1));
        System.out.println("Area of sphere: " + sphere(r2));
    }
    
    public static double circle(int radius) {
        //double PI = 3.14;
        return radius*radius*p;
    }
    
    public static double sphere(int radius) {
        //double PI = 3.14;
        return 4*p*radius*radius;
    }
}
