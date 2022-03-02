/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverbinarysearchtree;

/**
 *
 * @author fansari
 */
/*I want to store objcets with the tipe of Citi class in a BST, if I want to create a SBT to store
those objects, thei need to be searchable, citi tipe objects can be searchable if Citi class
extends KeyedItem*/
public class City extends KeyedItem<String> {
    // city's name will be designated as search key

    private String country;  // city's country
    private int pop;      // city's population

    public City(String theCity, String theCountry, int newPop) {
        super(theCity); // makes city name the search key
        country = theCountry;
        pop = newPop;
    }  // end constructor
//if I tri to print mi object with the tipe of Citi, it uses this toString method
    public String toString() {
        return getKey() + ", " + country + "  " + pop;
    }  // end toString
}  // end City
