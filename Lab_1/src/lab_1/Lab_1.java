/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

import java.util.Scanner;

/**
 *
 * @author anhhuynh
 */
public class Lab_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CreditCard  card = new CreditCard();
         Scanner input =  new Scanner( System.in);
  card.setValues();
  card.displayStatistics();
  card.cashAdvance(20);
 System.out.println("\n The outstanding balance "+ "after take out is: $"+card.getBalance());
  card.chargeCredit(30);
  System.out.println("\n The outstanding balance "+ "after charge is: $"+card.getBalance());
  card.makePayment(50);
  System.out.println("\n The outstanding balance "+ "after payment is: $"+card.getBalance());
  card.addInterest(0.02);
  System.out.println("\n The outstanding balance "+ "after add interest is: $"+card.getBalance());
  card.displayStatistics();
        
        // TODO code application logic here
    }
    
}
