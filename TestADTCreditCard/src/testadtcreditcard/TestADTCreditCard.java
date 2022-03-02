/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testadtcreditcard;

/**
 *
 * @author anhhuynh
 */
public class TestADTCreditCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ADTCreditCard  card = new ADTCreditCard();
  card.setValues("My Anh", 34789, "12/2020", 50, 100);
  card.displayStatistics();
  try{
  System.out.println(" Take out cash: $20");
  card.cashAdvance(20);
 System.out.println("\n The outstanding balance "+ "after take out is: $"+card.getBalance());
 System.out.println(" Charge amount: $30");
  card.chargeCredit(30);
  System.out.println("\n The outstanding balance "+ "after charge is: $"+card.getBalance());
  System.out.println(" Payment: $50");
  card.makePayment(50);
  System.out.println("\n The outstanding balance "+ "after payment is: $"+card.getBalance());
  System.out.println(" Interest this month: $0.02");
  card.addInterest(0.02);
  System.out.println("\n The outstanding balance "+ "after add interest is: $"+card.getBalance());
  System.out.println(" Update balance");
  card.displayStatistics();
        
        // TODO code application logic here
    }
    


    catch ( Exception e){
      System.out.println(" Out of limit")  ;
        

    
}
    }
    
}
