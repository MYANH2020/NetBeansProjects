/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

import testlinkedlist.Node;


/*ADT STACK HAS 3 IMPLEMENTATION

1. array based is using arrays to creat stack
2. LINKEDlist is using referenced linked list structure to cretae stack
3. adt list which has been implemneted by us using referencedbasedlinkedlist 

*/
/**
 *
 * @author fansari
 */
public class DriverStack {

    /**
     * @param args the command line arguments
     */
       public static final int MAX_ITEMS = 15;
    public static void main(String[] args) {
        
       


    StackArrayBased stack = new StackArrayBased();
    Integer items[] = new Integer[MAX_ITEMS];
    for (int i=0; i<MAX_ITEMS; i++) {
      items[i] = new Integer(i);
      if (!stack.isFull()) {
        stack.push(items[i]);
      }  // end if
    }  // end for
    while (!stack.isEmpty()) {
      // cast result of pop to Integer
      System.out.println((Integer)(stack.pop()));
    }  // end while
  } // end main
} // end StackTest
    
        // TODO code application logic here
        
        
        /*BalanceChecker b = new BalanceChecker();
        
        System.out.println(b.checkBalance("a {b [c (d + e)/2 - f] + 1}"));
        
        StackReferenceBased s1 = new StackReferenceBased();
        s1.push("5");
        s1.push("6");
        s1.push("5");
        s1.push("5");
        display(s1);
        
    }
    
    public static void display(StackReferenceBased s2)
	{
	  for (Node curr = s2.top; curr != null; curr = curr.next)
	  {
	    System.out.println(curr.item);
	  }
	}*/

    
    

