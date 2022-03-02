/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usestack;
import testlinkedlist.ListInterface;
import testlinkedlist.ListReferenceBased;

/**
 *
 * @author anhhuynh
 */
public class StackListBased implements StackInterface  {
    private ListInterface list;
    private int top;

  public StackListBased() {
   list = new ListReferenceBased(); 
   
  } 
  
  public boolean isEmpty() {
    return list.isEmpty();
  } 
     
  public void push(Object newItem) throws StackException {
    list.add(0,newItem);
  } 
  
  public Object pop() throws StackException {
    if (!list.isEmpty()) {
      Object temp = list.get(1);
      list.remove(0);
      return temp;
    }
    else {
      throw new StackException("StackException on " +"pop: stack empty");
    } 
  }  
  
  public void popAll() {
    list.removeAll();
  } 
  
  public Object peek() throws StackException {
    if (!isEmpty()) {
      return list.get(0);
    }
    else {
      throw new StackException("StackException on " +
                               "peek: stack empty");
    
}
  }
  public void popAndDiscard( int n){
        while (n>0 && !isEmpty()){
            try {
                pop();
            }
            catch (StackException e){   
            }
            n--;
        }
  }
}
