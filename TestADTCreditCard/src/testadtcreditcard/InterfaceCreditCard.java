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
public interface InterfaceCreditCard {
    public void setValues(String name, long accountNumber, String dueDate, int rewardPoint, double balance);
  public void chargeCredit(double charge) throws LimitException;
  public void cashAdvance( double advance) throws LimitException;
  public String getName();
  public long getAccountNumber();
   public String getdueDate();
    public int getRewardPoint();
    public double getBalance();
    public void makePayment ( double paymentAmount) throws LimitException;
     public void addInterest( double interest)throws LimitException ;
     public void displayStatistics();
     
    
}
