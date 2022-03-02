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
public class Point {
    private int x;
    private int y;
    public Point(){
        this(0,0);
    }
    public Point( int x, int y){
        this.x= x;
        this.y= y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
public void setLocation( int newX, int newY){
    x= newX;
    y= newY;
    
}
public void translate( int dx, int dy){
    x= x+ dx;
    y= y+ dy;
}
public double distance(Point other){
    int dx = x- other.x;
    int dy = y- other.y;
    return Math.sqrt(dx*dx+ dy*dy);
}
public double distanceFromOrigin(){
    return Math.sqrt(x*x + y*y);
}
public String toString(){
    return "(" +x +"," + y +")";
    
    
}

    
    
}
