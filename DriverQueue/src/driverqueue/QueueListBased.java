/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverqueue;

import testlinkedlist.ListInterface;
import testlinkedlist.ListReferenceBased;

/**
 *
 * @author fansari
 */
public class QueueListBased implements QueueInterface{
    private ListInterface aList;
    
    public QueueListBased(){
    aList = new ListReferenceBased();
                    
    }
    @Override
    public boolean isEmpty() {
        return aList.isEmpty();
    }

    @Override
    public void enqueue(Object newItem) throws QueueException {
        aList.add(aList.size(), newItem);
    }

    @Override
    public Object dequeue() throws QueueException {
    
    if(!isEmpty()){
        Object queueFront = aList.get(0);
        aList.remove(0);
        return queueFront;
    }else{
        throw new QueueException("dequeue");
    }
    }
    
    @Override
    public void dequeueAll() {
        aList.removeAll();
    }

    @Override
    public Object peek() throws QueueException {
        if(!isEmpty()){
        
        return aList.get(0);
    }else{
        throw new QueueException("peek");
    }
    }
    
}
