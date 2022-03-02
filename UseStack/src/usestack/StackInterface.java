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
public interface StackInterface {
    public boolean isEmpty();
    public void push(Object newItem) throws StackException;
    public Object pop() throws StackException;
    public void popAll();
     public Object peek() throws StackException;
}
