/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author anhhuynh
 */
public class Practice2 {
public static Scanner sc= new Scanner( System.in);
public static double PI= 3.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" enter the radius of circle: ");
        int r1= sc.nextInt();
        System.out.println("enter the radius of the sphere: ");
        int r2= sc.nextInt();
                System.out.println("the area of the circle is: "+circle(r1));
                System.out.println("the area of the sphere is: "+sphere(r2));
        // TODO code application logic here
    }
    public static double circle( int radius){
        return PI*radius*radius;
    }
    public static double sphere( int radius){
        return 4*PI*radius*radius;
    }
}
