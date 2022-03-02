/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertables;
import drivertree.KeyedItem;
/**
 *
 * @author fansari
 */
public interface TableInterface<T extends KeyedItem<KT>,  
          KT extends Comparable <? super KT>> {

// Table operations:
// Precondition for all operations: 
// No two items of the table have the same search key.
// The table's items are sorted by search key.

  public boolean tableIsEmpty();
  // Determines whether a table is empty.
  // Postcondition: Returns true if the table is 
  // empty; otherwise returns false.

  public int tableLength();
  // Determines the length of a table.
  // Postcondition: Returns the number of items in the
  // table.

  public void tableInsert(T newItem) 
                         throws TableException;
  // Inserts an item into a table in its proper sorted
  // order according to the item's search key.
  // Precondition: The item to be inserted into the 
  // table is newItem, whose search key differs from 
  // all search keys presently in the table.
  // Postcondition: If the insertion was successful, 
  // newItem is in its proper order in the table.
  // Otherwise, the table is unchanged, and 
  // TableException is thrown.

  public boolean tableDelete(KT searchKey);
  // Deletes an item with a given search key from a 
  // table.
  // Precondition: searchKey is the search key of the 
  // item to be deleted.
  // Postcondition: If the item whose search key equals
  // searchKey existed in the table, the item was 
  // deleted and method returns true. Otherwise, the 
  // table is unchanged and the method returns false.

  public T tableRetrieve(KT searchKey);
  // Retrieves an item with a given search key from a 
  // table.
  // Precondition: searchKey is the search key of the 
  // item to be retrieved.
  // Postcondition: If the retrieval was successful,
  // the table item with the matching search key is
  // returned. If no such item exists, the method
  // returns a null reference.

}  // end TableInterface


