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
import java.util.ArrayList;

// *********************************************************
// ADT table. 
// Sorted array-based implementation.
// Assumption: A table contains at most one item with a 
//             given search key at any time.
// *********************************************************
public class TableArrayBased<T extends KeyedItem<KT>, KT extends Comparable<? super KT>>
        implements TableInterface<T, KT> {

    final int MAX_TABLE = 100;        // maximum size of table
    protected ArrayList<T> items;     // table items

    public TableArrayBased() {
        items = new ArrayList<T>(MAX_TABLE);
    }  // default constructor

    public boolean tableIsEmpty() {
        return tableLength() == 0;
    } // end tableIsEmpty

    public int tableLength() {
        return items.size();
    }  // end tableLength

    public void tableInsert(T newItem)
            throws TableException {
        // Calls: position.
        if (tableLength() < MAX_TABLE) {
            // there is room to insert;
            // locate the position where newItem belongs
            int spot = position(newItem.getKey());
            if ((spot < tableLength())
                    && (items.get(spot).getKey()).compareTo(newItem.getKey()) == 0) {
                // we have found a duplicate key
                throw new TableException("Table Exception: "
                        + "Insertion failed, duplicate key item");
            } else {
                // ArrayList automatically shifts items to make room 
                // for the new item
                items.add(spot, newItem);
            }  // end if
        } else {
            throw new TableException("TableException: Table full");
        } // end if
    }  // end tableInsert

    public boolean tableDelete(KT searchKey) {
        // Calls: position.
        // locate the position where searchKey exists/belongs
        int spot = position(searchKey);
        // is searchKey present in the table?
        boolean success = (spot <= tableLength())
                && (items.get(spot).getKey().compareTo(searchKey) == 0);
        if (success) {
            // searchKey in table
            // ArrayList automatically shifts items
            items.remove(spot);
        }  // end if

        return success;
    }  // end tableDelete

    public T tableRetrieve(KT searchKey) {
        // Calls: position.

        // locate the position where searchKey exists/belongs
        int spot = position(searchKey);
        // is searchKey present in table?
        boolean success = (spot < tableLength())
                && (items.get(spot).getKey().compareTo(searchKey) == 0);
        if (success) {
            return items.get(spot);  // item present; retrieve it
        } else {
            return null;
        }  // end if
    }  // end tableRetrieve

    protected int position(KT searchKey) {
        // Finds the position of a table item or its insertion 
        // point.
        // Precondition: searchKey is the value of the search key
        // sought in the table.
        // Postcondition: Returns the index (between 0 and size - 1)
        // of the item in the table whose search key equals 
        // searchKey. If no such item exists, returns the position
        // (between 0 and size) that the item would occupy if
        // inserted into the table. The table is unchanged.
        int pos = 0;
        while ((pos < tableLength())
                && (searchKey.compareTo(items.get(pos).getKey()) > 0)) {
            pos++;
        }  // end while
        return pos;
    }  // end position

}  // end TableArrayBased


