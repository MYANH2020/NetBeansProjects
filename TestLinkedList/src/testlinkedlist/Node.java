/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlinkedlist;

public class Node {
  public Object item;// item is the content of the object
  public Node next;// is the address to the next node
  // Node newNode = new Node(5);

  public Node(Object newItem) {
    item = newItem;
    next = null;
    // Node newNode2 = new Node(4,0);
  } // end constructor

  public Node(Object newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Object newItem) {
    item = newItem;
  } // end setItem

  public Object getItem() {
    return item;
  } // end getItem

  public void setNext(Node nextNode) {
    next = nextNode;
  } // end setNext

  public Node getNext() {
    return next;
  } // end getNext
} // end class Node