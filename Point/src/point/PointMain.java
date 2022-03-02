/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author anhhuynh
 */
public class PointMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1= new Point(4,-2);
        Point p2= new Point(2,3);
        System.out.println("the x-coordinating is : "+ p1.getX());
        System.out.println(" the y- coordinating is: " + p1.getY());
        p2.translate(2, 2);
        System.out.println("p2"+p2.toString());
    
                
        System.out.println(" the distance :"+    p1.distanceFromOrigin());
        p1.setLocation(6, 7);
        System.out.println("the new position: "+ p1.toString());
        
        
        // TODO code application logic here
    }
    
}
