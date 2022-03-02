/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaps;

import java.util.Arrays;

/**
 *
 * @author fansari
 */
public class Heaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeapException {
        // TODO code application logic here
        Heap<Integer> h = new Heap<Integer>();
        int item;

        h.heapInsert(2);
        h.heapInsert(3);
        h.heapInsert(4);
        h.heapInsert(1);
        h.heapInsert(9);
        item = h.heapDelete();
        h.heapInsert(7);
        h.heapInsert(6);
        item = h.heapDelete();
        h.heapInsert(5);
        
    }

}
