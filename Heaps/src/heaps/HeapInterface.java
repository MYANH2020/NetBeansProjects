/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heaps;

/**
 *
 * @author fansari
 */
public interface HeapInterface<T> {
    public boolean heapIsEmpty();
    public void heapInsert(T newItem) throws HeapException, ClassCastException;
    public T heapDelete();
}
