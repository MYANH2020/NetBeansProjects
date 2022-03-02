/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplegeneric;

/**
 *
 * @author fansari
 */
/* A class of ordered pairs of objects having the same data type.*/
public class OrderedPair implements Pairable {

    private Object first, second;

    public OrderedPair(Object firstItem, Object secondItem) { // NOTE: no <T> after constructor name
        first = firstItem;
        second = secondItem;
    } // end constructor

    // Returns the first object in this pair.
    public Object getFirst() {
        return first;
    } // end getFirst

    //Returns the second object in this pair.
    public Object getSecond() {
        return second;
    } // end getSecond 

    //Interchanges the objects in this pair.
    public void changeOrder() {
        Object temp = first;
        first = second;
        second = temp;
    } // changeOrder
    
    //Returns a string representation of this pair.
    public String toString() {
        return "(" + first + ", " + second + ")";
    } // end toString
} // end OrderedPair


