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
public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle( int width, int height ){
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return 2*(width + height);
    }
    
}
