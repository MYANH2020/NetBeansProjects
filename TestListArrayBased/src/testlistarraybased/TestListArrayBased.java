/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//demonstrate the use of listArrayBased
/*Data abstraction create a waal around a program's data structure, to make it modular. 
such walls makes programs easier to design, implement, read and modify. */
//ADT is the specification data and operations on data
//data hiding helps with data abstraction 
/*Step 1: fully define an ADT (data and operations on data)
Step 2: (implementation) make a choise about data structure that you want to use
Step 3: access the data structure using ADT operations(hide the implementation 
behind the wall of ADT operations, that's why uo define ADT as a class) */

package testlistarraybased;

/**
 *
 * @author fansari
 */
public class TestListArrayBased {
// step 1: client program need to talk to the wall
    //step 2: client program creatte an object with the type of interface
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ListInterface aList = new ListArrayBased();     
       
       aList.add(0, "Jack");
       System.out.println(aList.get(0));
       
       String dataItem;
       aList.add(1, "Cathryn");
       dataItem = (String) aList.get(1);
       System.out.println(dataItem);
    }
    
}
