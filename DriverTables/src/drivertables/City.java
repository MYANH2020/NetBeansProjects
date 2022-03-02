/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertables;
import drivertree.KeyedItem;

/**
 *
 * @author forough
 */
//City class
public class City extends KeyedItem<String> {
    // city's name will be designated as search key

    private String country;  // city's country
    private int pop;      // city's population

    public City(String theCity, String theCountry,
            int newPop) {
        super(theCity); // makes city name the search key
        country = theCountry;
        pop = newPop;
    }  // end constructor

    public String toString() {
        return getKey() + ", " + country + "  " + pop;
    }  // end toString
}  // end City


