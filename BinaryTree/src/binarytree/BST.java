/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;




/**
 *
 * @author anhhuynh
 */
public class BST  {
    public Node createNewNode (int k){
       Node a = new Node();
       a.data = k;
       a.left = null;
       a.right = null;
       return a;
       
       
       
        
    }
    public void inorder( Node node){
       if ( node == null) {
           return;
       }
       inorder ( node.left);
       System.out.print(node.data +  " ");
       inorder( node.right);
    }
    public Node insert( Node node, int val){
        
        if (node == null) {
            return createNewNode(val);
        }
         if ( val < node.data){
            node.left = insert(node.left, val);
            
        }
         else if ( val > node.data){
             node.right = insert( node.right, val);
         }
        return node;
    }
    
}
