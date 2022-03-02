/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverbinarysearchtree;
//I have access to the classes in the drivertree package
import drivertree.BinaryTreeBasis;
import drivertree.TreeException;
import drivertree.TreeNode;

/**
 *
 * @author fansari
 */
// an example of an object with the type of BinarySearchTree
//creating a data structure using BST
//I need to specifi the tipe of objects that thei are going to be stored in the tree: City
//I need to put the tipe of serach kei here as well
//BinarySearchTree<City, String> BSTtree = new BinarySearchTree<City, String>();
public class BinarySearchTree<T extends KeyedItem<KT>, KT extends Comparable<? super KT>> 
    extends BinaryTreeBasis<T> {
    // inherits isEmpty(), makeEmpty(), getRootItem(), and
    // the use of the constructors from BinaryTreeBasis

    public BinarySearchTree() {
    }  // end default constructor
    //calls the constructor in the super class to set the calue of rootItem
    public BinarySearchTree(T rootItem) {
        super(rootItem);
    }  // end constructor
    //we don't need a specific body implementation for this methods, not supported yet
    public void setRootItem(T newItem)
            throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }  // end setRootItem
    //Calls insertItem method to insert a newItem in the BST
    //Anyone who has the address of the root, will get access to the created BSTtree
    public void insert(T newItem) {
        root = insertItem(root, newItem);
    }  // end insert
    //Calls retrieveItem method to retirve the node with a specified searchKey value from BSTtree
    public T retrieve(KT searchKey) {
        return retrieveItem(root, searchKey);
    }  // end retrieve
    //Calls deleteItem method to delete the node with searchKey value from BSTtree
    public void delete(KT searchKey) throws TreeException {
        root = deleteItem(root, searchKey);
    }  // end delete
    //Calls deleteItem method to delete the node from BSTtree with searchKey value that we get using the item.getKey()
    public void delete(T item) throws TreeException {
        root = deleteItem(root, item.getKey());
    }  // end delete
    //
    protected TreeNode<T> insertItem(TreeNode<T> tNode, T newItem) {
        
        if (tNode == null) {
            // position of insertion found; insert after leaf
            // create a new node
            tNode = new TreeNode<T>(newItem, null, null);
            return tNode;
        }  // end if//tree is not empti
        T nodeItem = tNode.item;
        //create a reference variable to the subtree to make the problems smaller
        //only look one side the root
        TreeNode<T> newSubtree;

        // search for the insertion position
        
        /*compareTo: Compares this object with the specified object for order.
        /Returns a negative integer, zero, or a positive integer as this object is 
        less than, equal to, or greater than the specified object.*/
        if (newItem.getKey().compareTo(nodeItem.getKey()) < 0) {
            // search the left subtree
            //now the begining of the search changes to the left side of the root
            newSubtree = insertItem(tNode.leftChild, newItem);
            tNode.leftChild = newSubtree;
            return tNode;
        } else { // search the right subtree
            newSubtree = insertItem(tNode.rightChild, newItem);
            tNode.rightChild = newSubtree;
            return tNode;
        }  // end if
    }  // end insertItem

    protected T retrieveItem(TreeNode<T> tNode, KT searchKey) {
        T treeItem;
        if (tNode == null) {
            treeItem = null;
        } else {
            T nodeItem = tNode.item;
            if (searchKey.compareTo(nodeItem.getKey()) == 0) {
                // item is in the root of some subtree
                treeItem = tNode.item;
            } else if (searchKey.compareTo(nodeItem.getKey()) < 0) {
                // search the left subtree
                treeItem = retrieveItem(tNode.leftChild, searchKey);
            } else { // search the right subtree
                treeItem = retrieveItem(tNode.rightChild, searchKey);
            }  // end if
        }  // end if
        return treeItem;
    }  // end retrieveItem

    protected TreeNode<T> deleteItem(TreeNode<T> tNode, KT searchKey) {
        // Calls: deleteNode.
        TreeNode<T> newSubtree;
        if (tNode == null) {
            throw new TreeException("TreeException: Item not found");
        } else {
            T nodeItem = tNode.item;
            if (searchKey.compareTo(nodeItem.getKey()) == 0) {
                // item is in the root of some subtree
                tNode = deleteNode(tNode);  // delete the item
            } // else search for the item
            else if (searchKey.compareTo(nodeItem.getKey()) < 0) {
                // search the left subtree
                newSubtree = deleteItem(tNode.leftChild, searchKey);
                tNode.leftChild = newSubtree;
            } else { // search the right subtree
                newSubtree = deleteItem(tNode.rightChild, searchKey);
                tNode.rightChild = newSubtree;
            }  // end if
        }  // end if
        return tNode;
    }  // end deleteItem

    protected TreeNode<T> deleteNode(TreeNode<T> tNode) {
        // Algorithm note: There are four cases to consider:
        //   1. The tNode is a leaf.
        //   2. The tNode has no left child.
        //   3. The tNode has no right child.
        //   4. The tNode has two children.
        // Calls: findLeftmost and deleteLeftmost
        T replacementItem;

        // test for a leaf
        if ((tNode.leftChild == null) && (tNode.rightChild == null)) {
            return null;
        } // end if leaf
        // test for no left child
        else if (tNode.leftChild == null) {
            return tNode.rightChild;
        } // end if no left child
        // test for no right child
        else if (tNode.rightChild == null) {
            return tNode.leftChild;
        } // end if no right child
        // there are two children:
        // retrieve and delete the inorder successor
        else {
            /*find the left most node of the search key in tNode; 
            it is the leftmost node of the subtree
            rooted at tNode's right child
            */
            replacementItem = findLeftmost(tNode.rightChild);
            //set the item of tNode to replacementItem
            tNode.item = replacementItem;
            //set tNode's right child to replacementItem
            tNode.rightChild = deleteLeftmost(tNode.rightChild);
            return tNode;
        }  // end if
    }  // end deleteNode
    /*
    returns the item that is the left most descendant of the tree roosted at treeNode
    */
    protected T findLeftmost(TreeNode<T> tNode) {
        if (tNode.leftChild == null) {
            //This is the node that you want, so return its item
            return tNode.item;
        } else {
            return findLeftmost(tNode.leftChild);
        }  // end if
    }  // end findLeftmost

    /*deletes the node that is the leftMost descendant of the tree rooted at tNode
    returns subTree of deleted node
    */
    protected TreeNode<T> deleteLeftmost(TreeNode<T> tNode) {
        //This is the node that you want, it has no left child
        //but it might have a right subtree that you return
        if (tNode.leftChild == null) {
            return tNode.rightChild;
        } else {
            tNode.leftChild = deleteLeftmost(tNode.leftChild);
            return tNode;
        }  // end if
    }  // end deleteLeftmost

}  // end BinarySearchTree

