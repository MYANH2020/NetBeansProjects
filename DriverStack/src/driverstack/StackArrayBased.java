/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

/**
 *
 * @author fansari
 */
public class StackArrayBased implements StackInterface {
    // array is fixed size 0-49

    final int MAX_STACK = 50;  // maximum size of stack
    private Object items[];
    private int top;
    
    // create an empty array

    public StackArrayBased() {
        items = new Object[MAX_STACK];
        top = -1;// when top is -1, it means array is empty
    }  // end default constructor

    public boolean isEmpty() {
        return top < 0;
    }  // end isEmpty

    public boolean isFull() {
        return top == MAX_STACK - 1;
    }  // end isFull

    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        } else {
            throw new StackException("StackException on "
                    + "push: stack full");
        }  // end if
    }  // end push

    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }  // end popAll

    public Object pop() throws StackException {
        //check to see we have items to remove from stack
        if (!isEmpty()) {
            
            return items[top--];
        } else {
            throw new StackException("StackException on "
                    + "pop: stack empty");
        }  // end if
    }  // end pop

    public Object peek() throws StackException {
        //retrieve the top of the stack
        if (!isEmpty()) {
            return items[top];
        } else {
            throw new StackException("Stack exception on "
                    + "peek - stack empty");
        }  // end if
    }  // end peek
}  // end StackArrayBased
