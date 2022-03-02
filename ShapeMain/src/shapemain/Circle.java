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
public class Circle implements Shape {
    private double radius;
    public Circle( double radius){
        this.radius= radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return Math.PI*2*radius;
    }
    
}
