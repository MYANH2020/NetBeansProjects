/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

import testlinkedlist.ListInterface;
import testlinkedlist.ListReferenceBased;

/**
 *
 * @author fansari
 */

public class StackListBased implements StackInterface {
  private ListInterface list;

  public StackListBased() {
    list = new ListReferenceBased(); 
  }  // end default constructor
  
  public boolean isEmpty() {
    return list.isEmpty();
  }  // end isEmpty
     
  public void push(Object newItem) {
    list.add(0, newItem);
  }  // end push
  
  public Object pop() throws StackException {
    if (!list.isEmpty()) {
      Object temp = list.get(1);
      list.remove(0);
      return temp;
    }
    else {
      throw new StackException("StackException on " +"pop: stack empty");
    }  // end if
  }  // end pop
  
  public void popAll() {
    list.removeAll();
  }  // end popAll
  
  public Object peek() throws StackException {
    if (!isEmpty()) {
      return list.get(0);
    }
    else {
      throw new StackException("StackException on " +
                               "peek: stack empty");
    }  // end if
  }  // end peek
}  // end StackListBased
