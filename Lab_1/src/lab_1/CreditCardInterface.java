/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

/**
 *
 * @author anhhuynh
 */
public interface CreditCardInterface {
    public void setValues();
     public void chargeCredit(double charge);
      public void cashAdvance( double advance);
       public String getName();
        public long getAccountNumber();
        public String getdueDate();
        public int getRewardPoint();
        public double getBalance();
        public void makePayment ( double paymentAmount);
         public void addInterest( double interest);
         public void displayStatistics();
    
}
