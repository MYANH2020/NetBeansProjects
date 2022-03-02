/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usestack;

/**
 *
 * @author anhhuynh
 */
public class StackReferenceBase implements StackInterface {
    private Node top;

  public StackReferenceBase() {
    top = null; 
  } 
  
  public boolean isEmpty() {
    return top ==  null;
  } 
  public Node getTop(){
      return top;
  }

  public void push(Object newItem) {
    top = new Node(newItem, top);
  } 
  
  public Object pop() throws StackException {
    if (!isEmpty()) {
      Node temp = top;
      top = top.getNext();
      return temp.getItem();
    }
    else {
      throw new StackException("StackException on " +
                               "pop:the stack is empty");
    }  
  } 
  
  public void popAll() {
    top = null;
  } 
  
  public Object peek() throws StackException {
    if (!isEmpty()) {
      return top.getItem();
    }
    else {
      throw new StackException("StackException on " +
                               "peek: the stack is empty");
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
