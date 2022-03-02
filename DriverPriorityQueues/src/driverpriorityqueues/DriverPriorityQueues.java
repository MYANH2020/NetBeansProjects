/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverpriorityqueues;

import heaps.HeapException;

/**
 *
 * @author fansari
 */
public class DriverPriorityQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PriorityQueueException, HeapException {
        // TODO code application logic here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.pqInsert(87);
        pq.pqInsert(2);
        pq.pqInsert(10);
        pq.pqInsert(5);
        System.out.println("The elements will be processed in this order:");
        System.out.print(pq.pqDelete());
        while (!pq.pqIsEmpty()) {
            System.out.print(", " + pq.pqDelete());
        }
        System.out.println();
    }

}
