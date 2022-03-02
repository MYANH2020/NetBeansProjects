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
public class DriverBinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a binary search tree(A type of data structure) to store teh cities 
        //k is City, KT  is String
        BinarySearchTree<City, String> BSTtree = new BinarySearchTree<City, String>();
        City c = new City("Narragansett", "USA", 12000);
        BSTtree.insert(c);
        City c1 = new City("OC, NC", "USA", 769);
        BSTtree.insert(c);
        System.out.println(BSTtree.retrieve("Narragansett"));
        System.out.println(c.getKey());
        

    }
    
}
