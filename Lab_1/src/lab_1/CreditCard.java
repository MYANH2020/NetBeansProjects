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
public class CreditCard implements CreditCardInterface {
    private String name;
    private long accountNumber;
    private String dueDate;
    private int rewardPoint;
    private double balance;
    
    public CreditCard(){
         setValues();
    }
    public void setValues(){
       Scanner input = new Scanner( System.in);
       System.out.println(" Please enter your name: ");
       String n = input.next();
       n= this.name;
       System.out.println("Please enter your account number: ");
       long a = input.nextLong();
       a= this.accountNumber;
              System.out.println("Please enter your due date: ");
              String d = input.next();
              d= this.dueDate;
              System.out.println("Please enter your reward point: ");
              int p = input.nextInt();
              p= this.rewardPoint;
             System.out.println("Please enter your balance: "); 
             double b = input.nextDouble();
             b= this.balance;
       
       
    }
    public void chargeCredit(double charge){
        
       this.balance = this.balance + charge;
    }
    public void cashAdvance( double advance){
           this.balance = this.balance + advance;
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
    
    public void makePayment ( double paymentAmount){
        this.balance = this.balance - paymentAmount;
    }
    
    public void addInterest( double interest){
        this.balance = this.balance + interest;
    }
    

    public void displayStatistics(){
        System.out.println(" Account name: "+ name);
          System.out.println(" Account number: "+ accountNumber);
          System.out.println(" Due date: "+ dueDate);
           System.out.println(" Reward point: "+ rewardPoint);
           System.out.println("Acount balance: "+ balance);
    }
}
