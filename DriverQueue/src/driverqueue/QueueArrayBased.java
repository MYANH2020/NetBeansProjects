/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverqueue;

/**
 *
 * @author fansari
 */
public class QueueArrayBased implements QueueInterface {
// count keep track with the numbers of item in the array
    private final int MAX_QUEUE = 50;
    private Object[] items;
    private int front, back, count;

    public QueueArrayBased() {
        items = new Object[MAX_QUEUE];
        front = 0;
        // front point to the front of the array
        // back point to the back of the array
        back = MAX_QUEUE - 1;
        count = 0;
        // queue operation
        // no item in the array
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX_QUEUE;
    }

    @Override
    public void enqueue(Object newItem) throws QueueException {
        if (!isEmpty()) {
            
            // special case: insertion into empty queue
// newNode.next = newNode;
            back = (back + 1) % (MAX_QUEUE);
            items[back] = newItem;
            ++count;

        } else {
            // insertion into nonempty queue
            // newNode.next = lastNode.next;
            //lastNode.next = newNode;
            throw new QueueException("QueueException on enqueue");
        }
    }

    @Override
    public Object dequeue() throws QueueException {
        if (!isEmpty()) {
            Object queueFront = items[front];
            front = (front + 1) % (MAX_QUEUE);

            --count;
            return queueFront;
        } else {
            throw new QueueException("QueueException on dequeue");
        }
    }

    @Override
    public void dequeueAll() {
        items = new Object[MAX_QUEUE];
        front = 0;
        back = MAX_QUEUE - 1;
        count = 0;
    }

    @Override
    public Object peek() throws QueueException {
        if (!isEmpty()) {

            return items[front];
        } else {
            throw new QueueException("QueueException on dequeue");
        }
    }

}
