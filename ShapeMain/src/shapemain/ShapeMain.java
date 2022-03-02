/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

/**
 *
 * @author anhhuynh
 */
public class ShapeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r= new Rectangle(2,4);
        System.out.println(" the area:"+ r.area());
        Circle c = new Circle(4);
        System.out.println(" the area circle"+ c.area());
        // TODO code application logic here
    }
    
}
