/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverqueue;

import testlinkedlist.Node;

/**
 *
 * @author fansari
 */
public class QueueReferenceBased implements QueueInterface{
    private Node lastNode;
    
    public QueueReferenceBased(){
        lastNode = null;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public void enqueue(Object newItem) {
        Node newNode = new Node(newItem);
        if (isEmpty())
         newNode.next = newNode;
        else{
         newNode.next=lastNode.next;
         lastNode.next = newNode;
        }
      lastNode = newNode;
        
    }

    @Override
    public Object dequeue() throws QueueException {
        if(!isEmpty()){
            //remove front
            Node firstNode = lastNode.next;
            if(firstNode == lastNode){// one node in the queue
                lastNode = null;
            }else{
                lastNode.next = firstNode.next;
            }
            return firstNode.item;
        }else{
            throw new QueueException("dequeue error");
        }
    }

    @Override
    public void dequeueAll() {
        lastNode = null;
    }

    @Override
    public Object peek() throws QueueException {
        if(!isEmpty()){
            //retrieve front
            Node firstNode = lastNode.next;
            
            return firstNode.item;
        }else{
            throw new QueueException("dequeue error");
        }
    }
    
    
}
