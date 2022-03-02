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
public class ADTCreditCard implements InterfaceCreditCard {
     private String name;
    private long accountNumber;
    private String dueDate;
    private int rewardPoint;
    private double balance;
    private static final double LIMIT = 150.00;
    
    public ADTCreditCard(){
         setValues("", 00000, "01/20", 0, 0.0);
    }
    public void setValues(String name, long accountNumber, String dueDate, int rewardPoint, double balance){
       this.name = name;
       this.accountNumber = accountNumber;
       this.dueDate = dueDate;
       this.rewardPoint =  rewardPoint;
       this.balance = balance;
    }
    public void chargeCredit(double charge) throws LimitException{
        if (this.balance > LIMIT){
            throw new LimitException("Over Limit");
        }
        else {
        
       this.balance = this.balance + charge;
    }
    }
    public void cashAdvance( double advance) throws LimitException{
        if ( this.balance > LIMIT){
            throw new LimitException("Over Limit");
        }
        else {
           this.balance = this.balance + advance;
    }
    }
    
    
    public String getName(){
        return name;
    }
    
    
    public long getAccountNumber(){
        return accountNumber;
    }
    
    public String getdueDate(){
        return dueDate;
    }
        
    public int getRewardPoint(){
        return rewardPoint;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void makePayment ( double paymentAmount) throws LimitException{
        if (this.balance > LIMIT) {
            throw new LimitException("Over Limit ");
        }
        else{
        
        this.balance = this.balance - paymentAmount;
    }
    }
    
    public void addInterest( double interest) throws LimitException{
        if (this.balance > LIMIT){
            throw new LimitException("Over Limit");
        }
        else {
        this.balance = this.balance + interest;
    }
    }
    

     @Override
    public void displayStatistics(){
        System.out.println(" Account name: "+ name);
          System.out.println(" Account number: "+ accountNumber);
          System.out.println(" Due date: "+ dueDate);
           System.out.println(" Reward point: "+ rewardPoint);
           System.out.println("Acount balance: "+ balance);
    }
    
    
    
    
}
