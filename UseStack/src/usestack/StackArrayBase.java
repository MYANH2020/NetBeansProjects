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
public class StackArrayBase implements StackInterface {
    final private int MAX_STACK = 50;
    private Object items [];
    private int top;
    public StackArrayBase(){
        items = new Object[MAX_STACK];
        top = -1;
        
    }
    public boolean isEmpty(){
        return top <0;
    }
    public boolean isFull(){
        return top == MAX_STACK -1;
    }
    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        } else {
            throw new StackException("StackException on "
                    + "push: the stack is full");
        }
    }
    public Object pop() throws StackException {
        if (!isEmpty()) {
            
            return items[top--];
        } else {
            throw new StackException("StackException on "
                    + "pop: the stack is empty");
        }
    }
    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }
    public Object peek() throws StackException {
        if (!isEmpty()) {
            return items[top];
        } else {
            throw new StackException("Stack exception on "
                    + "peek: the stack is empty");
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
