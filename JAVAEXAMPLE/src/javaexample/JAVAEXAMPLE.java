/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
/**
 *
 * @author anhhuynh
 */
public class JAVAEXAMPLE {

    /**
     * @param args the command line arguments
     */
    
        public boolean isItemInArray( String item, String [] items){
            for ( String i : items){
                if ( i.toLowerCase().equals(items)){
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
        
        // DECLARE AN ARRAY
        int [] nums;
        // declaring, allocating, and initializing an array
        String [] availablePets = { "cat", "dog", " fish"};
        String [] unavailablePets = { "bird", "rabbit", "hambster", "gerbil"};
        System.out.println(" The available pet: " + Arrays.toString(availablePets));
        System.out.println(" The unavailable pet: " + Arrays.toString(unavailablePets));
        int indexOfAvailablePet = 2; // index of fish;
        int indexOfUnavailablePet = 0; // index of bird;
        String availablePet = availablePets[indexOfAvailablePet];// Fish
        String unavailablePet = unavailablePets[indexOfUnavailablePet];//BIRD
        availablePets[indexOfAvailablePet] = unavailablePet;
        unavailablePets[indexOfUnavailablePet] = availablePet;
        System.out.println();
        System.out.println(" The available pet: " + Arrays.toString(availablePets));
        System.out.println(" The unavailable pet: " + Arrays.toString(unavailablePets));
        
       // isItemInArray("butterfly",String [] availablePets);
       LinkedList <String> students = new LinkedList<>();
       // add student to the Linked List
       students.add("HONG");
          students.add("MAI");
             students.add("DAO");
                students.add("LY");
                   students.add("LEM");
        System.out.println(students);
        System.out.println();
        students.addFirst("LUN");
        students.addLast("BA");
        students.add(2, "LINH");
        String firstStudent = students.getFirst();
        System.out.println("First: " +firstStudent );
        String lastStudent = students.getLast();
         System.out.println("Last: " +lastStudent );
         System.out.println(students.size());
         System.out.println(students);
         String secondStudents = students.get(1);
         System.out.println("Second student: "+ secondStudents);
         int i = students.indexOf(" DAO");
         System.out.println(" index of DAO: "+ i);
         students.removeFirst();
         students.removeLast();
         students.remove("LINH");
         students.remove(3);
         System.out.println(students);
         boolean hasLun = students.contains("LUN");
         System.out.println(hasLun);
         students.clear();
         System.out.println(students);
         Queue <String> queue = new LinkedList();
         // enqueue items
         queue.add("Moon");
         queue.add("Sun");
         queue.add("Star");
         queue.add("Rain");
        
         System.out.println(queue);
         String nextInQueue = queue.peek();
         System.out.println(" Next up: "+ nextInQueue);
        for (int j = 0; j<queue.size(); j++){
            queue.remove();
            System.out.println(queue);
        }
        String recentlyRemove = queue.remove();
        System.out.println(recentlyRemove);
         System.out.print(queue);
         Stack<String> deckOfCards = new Stack();
         String card1 = "Jack : diamonds";
         String card2 = "8 : heart";
         String card3 = "3 : Clubs";
         deckOfCards.push(card1);
           deckOfCards.push(card2);
             deckOfCards.push(card3);
             System.out.println();
             System.out.println(deckOfCards);
             String top = deckOfCards.peek();
             System.out.println(top);
             System.out.println(deckOfCards.size());
             while(!deckOfCards.empty()){
                 String removedItem = deckOfCards.pop();
                 System.out.println("Removed :" + removedItem );
                 
             }
             HashMap<String, Integer> wordToNum = new HashMap();
             // insert the key value pairs into the HashMap
             wordToNum.put("One", 1);
             wordToNum.put("Two", 2);
             wordToNum.put("Three", 3);
             wordToNum.put("Four", 4);
             wordToNum.put("Five", 5);
             System.out.println(wordToNum);
             System.out.println(wordToNum.values());
             System.out.println(wordToNum.keySet());
             System.out.println(wordToNum.remove("Four"));
             System.out.println(wordToNum.keySet());
             // Common use of HashMap: which chatacter is the most repeated
             String s = "phonebook";
             HashMap<Character, Integer> hashMap = new HashMap();
             for (int i1= 0; i1<s.length(); i1++){
                 Character currentChar = s.charAt(i1);
                 if (hashMap.containsKey(currentChar)){
                     //incrememt current value for this key in hashmap by 1
                     hashMap.put(currentChar, hashMap.get(currentChar)+1);
                 }
                 else {
                     // if we haven't added it to the hashmap, then put it in with the value
                     hashMap.put(currentChar, 1);
                 }
                 
                 
             }
             Character mostRepeated = ' ';
             int max = 0;
             for ( Character key : hashMap.keySet()){
                 int currentValue = hashMap.get(key);
                 if ( currentValue > max){
                     mostRepeated = key;
                     max = currentValue;
                 }
             }
             System.out.println(" Most repeated: "+ mostRepeated + " | Times: "+ max);
             
             
             
             
         
        
            
        }
        
         
         
         
         
         
         
         
         
         
        
        
        
        
        
        
        
       

    
}
