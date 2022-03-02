/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usestack;

/**
 *
 * @author anhhuynh
 */
public class UseStack {

    
    public static final int MAX_ITEMS = 20;
    public static void main(String[] args) {
        StackArrayBase stack = new StackArrayBase();
        Integer items[] = new Integer[MAX_ITEMS];
    for (int i=0; i<MAX_ITEMS; i++) {
      items[i] = new Integer(i);
      if (!stack.isFull()) {
        stack.push(items[i]);
      }  
    }  
    while (!stack.isEmpty()) {
        System.out.println((Integer)(stack.pop()));
        StackReferenceBase s1 = new StackReferenceBase();
        s1.push(2);
        s1.push(3);
        s1.push(123);
        s1.push(78);
        display(s1);
    
    }
    }
    public static void display(StackReferenceBase s2){
        for( Node curr = s2.getTop(); curr != null; curr = curr.getNext()){
            System.out.println(curr.getItem());
        }
    }
        
        
    
    
    
    
}
