/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverqueue;

/**
 *
 * @author fansari
 */
public class Customer {
    
        private int arrivalTime;
	private int transactionTime;
	private int customerNumber;
	
	public Customer(int arrivalTime, int transactionTime, int customerNumber)
	{
		this.arrivalTime = arrivalTime;
		this.transactionTime = transactionTime;
		this.customerNumber = customerNumber;
	} // end constructor
	
	public int getArrivalTime()
	{
		return arrivalTime;
	} // end getArrivalTime
	
	public int getTransactionTime()
	{
		return transactionTime;
	} // end getTransactionTime
	
	public int getCustomerNumber()
	{
		return customerNumber;
	} // end getCustomerNumber
}

