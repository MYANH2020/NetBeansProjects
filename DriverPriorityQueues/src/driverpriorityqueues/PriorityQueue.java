/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverpriorityqueues;

import heaps.Heap;
import heaps.HeapException;
import java.util.Comparator;

/**
 *
 * @author forough
 */
public class PriorityQueue<T>{
  private Heap<T> h;

  public PriorityQueue() {
    h = new Heap<T>();
  }  // end default constructor

  public PriorityQueue(Comparator<? super T> comparator) {
    h = new Heap<T>(comparator);
  }  // end default constructor

  // priority-queue operations:
  public boolean pqIsEmpty() {
    return h.heapIsEmpty();
  }  // end pqIsEmpty

  public void pqInsert(T newItem) throws PriorityQueueException, HeapException {
    try {
      h.heapInsert(newItem);
    }  // end try
    catch (HeapException e) { 
      throw new PriorityQueueException(
                "PQueueException: Problem inserting to Priority Queue");
    }  // end catch
  }  // end pqInsert

  public T pqDelete() {
    return h.heapDelete();
  }  // end pqDelete
   
}  // end PriorityQueue

