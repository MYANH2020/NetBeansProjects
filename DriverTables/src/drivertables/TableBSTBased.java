/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertables;

/**
 *
 * @author fansari
 */
import drivertree.KeyedItem;
import drivertree.BinarySearchTree;
import drivertree.TreeException;

// Assumes that the binary search tree created in Chapter 11
// is contained in a package called binarytreeexample.

// ********************************************************
// Implementation of a table using a binary search tree.
// Assumption: A table contains at most one item with a 
//             given search key at any time.
// ********************************************************

public class TableBSTBased<T extends KeyedItem<KT>,
                          KT extends Comparable<? super KT>>
       implements TableInterface<T, KT> {
// binary search tree that contains the tables items
  protected BinarySearchTree<T,KT> bst; 
  protected int size;       // number of items in the table

  public TableBSTBased() {  
    bst = new BinarySearchTree<T,KT>();
    size = 0;
  }  // end default constructor
  
// table operations:
  public boolean tableIsEmpty() {
    return size == 0;
  }  // end tableIsEmpty
   
  public int tableLength() {
    return size;
  }  // end tableLength
  
  public void tableInsert(T newItem) 
                          throws TableException {
    if (bst.retrieve(newItem.getKey()) == null) { 
      bst.insert(newItem);
      ++size;
    }
    else {
      throw new TableException("Table Exception: Insertion" 
+ " failed, duplicate key item");
    } // end if
  }  // end tableInsert

  public T tableRetrieve(KT searchKey) {
    return bst.retrieve(searchKey);
  }  // end tableRetrieve

  public boolean tableDelete(KT searchKey) {
    try {
      bst.delete(searchKey);
    }  // end try
    catch (TreeException e) {
      return false;
    }  //end catch
    --size;
    return true;
  }  // end tableDelete

  protected void setSize(int newSize) {
    size = newSize;
  }  // end setSize

}  // end TableBSTBased


