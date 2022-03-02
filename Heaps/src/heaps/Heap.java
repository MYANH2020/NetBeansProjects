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
// This code will compile with 1 warning - for code
// that uses compareTo method for T - see compareItems
import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> implements HeapInterface<T> {

    private ArrayList<T> items;    // array of heap items
    private Comparator<? super T> comparator;

    public Heap() {
        items = new ArrayList<T>();
    }  // end default constructor

    public Heap(Comparator<? super T> comp) {
        items = new ArrayList<T>();
        comparator = comp;
    }  // end default constructor

// heap operations:
    public boolean heapIsEmpty() {
  // Determines whether a heap is empty.
        // Precondition: None.
        // Postcondition: Returns true if the heap is empty;
        // otherwise returns false.
        return items.size() == 0;
    } // end heapIsEmpty

    public void heapInsert(T newItem)
            throws HeapException, ClassCastException {
  // Inserts an item into a heap.
        // Precondition: newItem is the item to be inserted.
        // Postcondition: If the heap was not full, newItem is
        // in its proper position; otherwise HeapException is
        // thrown.
        if (!items.add(newItem)) {
            // problem adding element to ArrayList item for heap
            throw new HeapException("HeapException: heapInsert failed");
        } else {
            // trickle new item up to its proper position//place is position of new item
            int place = items.size() - 1;
            int parent = (place - 1) / 2;
            while ((parent >= 0)
                    && (compareItems(items.get(place), items.get(parent))) < 0) {
                // swap items[place] and items[parent]
                T temp = items.get(parent);
                items.set(parent, items.get(place));
                items.set(place, temp);

                place = parent;
                parent = (place - 1) / 2;
            }  // end while
        } // end else
    } // end heapInsert

    public T heapDelete() {
  // Retrieves and deletes the item in the root of a heap.
        // This item has the largest search key in the heap.
        // Precondition: None.
        // Postcondition: If the heap is not empty, returns the
        // item in the root of the heap and then deletes it. However,
        // if the heap is empty, removal is impossible and the
        // method returns null.
        T rootItem = null;
        int loc;
        if (!heapIsEmpty()) {
            rootItem = items.get(0);
            loc = items.size() - 1;
      // if we remove the item first, it may make the ArrayList items
            // empty, then set() won't work
            items.set(0, items.get(loc));
            items.remove(loc);
            heapRebuild(0);
        }  // end if
        return rootItem;
    } // end heapDelete

    protected void heapRebuild(int root) {
  // if the root is not a leaf and the root's search key 
        // is less than the larger of the search keys in the
        // root's children
        int child = 2 * root + 1;  // index of root's left 
        // child, if any
        if (child < items.size()) {
            // root is not a leaf, so it has a left child at child
            int rightChild = child + 1;  // index of right child, 
            // if any

            // if root has a right child, find larger child
            if ((rightChild < items.size())
                    && (compareItems(items.get(rightChild), items.get(child))) < 0) {
                child = rightChild;    // index of larger child
            } // end if

      // if the root's value is smaller than the
            // value in the larger child, swap values
            if (compareItems(items.get(root), items.get(child)) > 0) {
                T temp = items.get(root);
                items.set(root, items.get(child));
                items.set(child, temp);
                // transform the new subtree into a heap
                heapRebuild(child);
            }  // end if
        }  // end if
        // if root is a leaf, do nothing
    } // end heapRebuild

    private int compareItems(T item1, T item2) {
        //if it has natural ordering and comareto method is working
        if (comparator == null) {
            return ((Comparable<T>) item1).compareTo(item2);
        } else {
            //if it needs more than natural ordering, caompare method from comparator interface
            return comparator.compare(item1, item2);
        } // end if
    } // end compare
} // end Heap

/*public class ClassCastException
 extends RuntimeException
 Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance. 
For example, the following code generates a ClassCastException:
 Object x = new Integer(0);
 System.out.println((String)x);*/

/*because heap doesn't use search key for finding the greatest priority, it only has one formal data type parameter
 in order to arrange the elements properly, a method of comapring objects shoule be used,
 1- allowing natural oredering of elements through compareable interface or 
by providing a comparator objecct to the constructor
 */
/* 
 Interface Comparator<T>
 Type Parameters:
 T - the type of objects that may be compared by this comparator
 Comparators can also be used to control the order of certain data structures (such as sorted sets or sorted maps),
 or to provide an ordering for collections of objects that don't have a natural ordering. */
/* So now we know that if we want to sort java object array or list, we need to implement java Comparable interface to
 provide default sorting and we should implement java Comparator interface to provide different ways of sorting.*/
/*But, in most real-life scenarios, we want sorting based on different parameters. For example, as a CEO, I would 
 like to sort the employees based on Salary, an HR would like to sort them based on age. This is the situation
 where we need to use Java Comparator interface because Comparable.compareTo(Object o) method implementation 
 can provide default sorting and we can’t change it dynamically. Whereas with Comparator, we can define multiple
 methods with different ways of sorting and then chose the sorting method based on our requirements.*/
