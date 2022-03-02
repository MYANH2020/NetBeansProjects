/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightpuzzle1;

/**
 *
 * @author anhhuynh
 */
public interface QueueInterface {
    
    public boolean isEmpty();
    public void enqueue(Object newItem) throws QueueException;
    public Object dequeue() throws QueueException;
    public void dequeueAll();
    public Object peek() throws QueueException;


    
}
