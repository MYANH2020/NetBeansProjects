/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverbinarysearchtree;

/**
 *
 * @author fansari
 */
//Question mark, ?, is used to represent an unknown class type: Referred to as a wildcard
//a lower bounded wildcard restricts the unknown type to be a specific 
//type or a super type of that type
//The term List<Number> is more restrictive than List<? extends Number> 
//because List<Integer> matches a list of type Integer only, 
//whereas the List<? super Integer>  matches a list of type Integer or any of its superclasses.
//KT is any class which extends compareable 
//matches a compareable of type KT or any of its superclasses
//Number is super class of Double and Integer
//KT need to be ani class which extends comparable: KT can be replaced bi String
public abstract class KeyedItem<KT extends Comparable<? super KT>> {
    //data field
   private KT searchKey;
//the constructor instantiate the instance variable searchKei for each object
   public KeyedItem(KT key) {
      searchKey = key;
   }  // end constructor

   public KT getKey() {
      return searchKey;
   } // end getKey
} // end KeyedItem
