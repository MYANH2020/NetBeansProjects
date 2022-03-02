/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlinkedlist;

//import java.util.LinkedList;
//import java.util.Iterator;

public class TestLinkedList {
  public static void main(String[] args) {
        
        ListReferenceBased myList = new ListReferenceBased();
        myList.add(0, "20");
        myList.add(0, "15");
        myList.add(0, "17");
        
        myList.add(0, "16");
        myList.add(1, "25");
        myList.add(2, "35");
        myList.add(3, "45");
        myList.add(4, "105");
        myList.remove(2);
        
       
        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        //System.out.println(myList);
        //System.out.println(myList.size());
       // System.out.println(myList.isEmpty());
        //System.out.println(myList.get(0));
        //System.out.println("the list");
        //writeList(myList.getHead());

        
        
        /*ListReferenceBased<String> myList = new ListReferenceBased<String>();

        myList.add(0, "15");
        myList.add(1, "25");
        myList.add(2, "35");
        myList.add(2, "45");
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println(myList.get(2));
        myList.removeAll();
        System.out.println(myList.isEmpty());
        myList.add(0, "15");
        myList.add(1, "25");
        myList.add(2, "35");
        myList.add(3, "45");
        System.out.println(myList.size());*/
        
        

    }
  /*private static void writeList(Node nextNode) {
// ---------------------------------------------------------
// Writes a list of objects.
// Precondition: The linked list is referenced by nextNode.
// Postcondition: The list is displayed. The linked list
// and nextNode are unchanged.
// ---------------------------------------------------------
  if (nextNode != null) {
    // write the first data object
    System.out.println(nextNode.getItem());
    // write the list minus its first node
    writeList(nextNode.getNext());
  }  // end if
}  // end writeList
  
  private static void writeListBackward2(Node nextNode) {
// ----------------------------------------------------
// Writes a list of objects backwards.
// Precondition: The linked list is referenced by 
// nextNode.
// Postcondition: The list is displayed backwards. The 
// linked list and nextNode are unchanged.
// ----------------------------------------------------
  if (nextNode != null) {
    // write the list minus its first node backward
    writeListBackward2(nextNode.getNext());
    // write the data object in the first node
    System.out.println(nextNode.getItem());
  } // end if
}   // end writeListBackward2 */

} // end TestLinkedList
