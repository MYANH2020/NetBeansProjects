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
public class WaitLine {
    private QueueListBased line; 
    private int numberOfArrivals;
    private int numberServed; 
    private int totalTimeWaited;
    public WaitLine(){
        line = new QueueListBased();
        reset();
    }
    public void reset(){
      line.isEmpty();
      numberOfArrivals = 0;
      numberServed = 0;
      totalTimeWaited = 0;
    }
    /** Simulates a waiting line with one serving agent.
       @param duration  The number of simulated minutes.
       @param arrivalProbability  A real number between 0 and 1, and the
                                  probability that a customer arrives at
                                  a given time
       @param maxTransactionTime  The longest transaction time for a
                                  customer */ 
    public void simulate(int duration, double arrivalProbability, 
                        int maxTransactionTime)
   {
       
      int transactionTimeLeft = 0;
//At each value of the clock, the method sees whether the current customer is still being served and whether a new customer has arrived.
      for (int clock = 0; clock < duration; clock++)
      {
          /*
          If a new customer arrives, the method creates a new customer object, assigns it a random transaction time, 
          and places the customer into the queue. If a customer is still being served, the clock advances; 
          if not, a customer leaves the front of the queue and begins service. 
          cus- tomers enter the line at random intervals
          At each value of the clock, the method sees whether the current customer is still 
          being served and whether a new customer has arrived. 
          If a new customer arrives, the method creates a new customer object, 
          assigns it a random transaction time, and places the customer into the queue. 
          If a customer is still being served, the clock advances; if not, a customer 
          leaves the front of the queue and begins service. 
          At this point, the time the customer waited is noted. */
         if (Math.random() < arrivalProbability)
         {
            numberOfArrivals++;
            //Adding 1 to the result ensures that the transaction time is never 0 but allows a small chance 
            //that the transaction time will exceed the given maximum value by 1
            int transactionTime = (int)(Math.random() * maxTransactionTime + 1);
            Customer nextArrival = new Customer(clock, transactionTime, 
                                                numberOfArrivals);
            line.enqueue(nextArrival);
            System.out.println("Customer " + numberOfArrivals +
                               " enters line at time " + clock +
                               ". Transaction time is " + transactionTime);
         } // end if
         //if present custome is still being serve 
         if (transactionTimeLeft > 0)
            transactionTimeLeft--;
         else if (!line.isEmpty())
         {
            Customer nextCustomer = (Customer) line.dequeue();
            transactionTimeLeft = nextCustomer.getTransactionTime() - 1;
            int timeWaited = clock - nextCustomer.getArrivalTime();
            totalTimeWaited = totalTimeWaited + timeWaited;
            numberServed++;
            System.out.println("Customer " + nextCustomer.getCustomerNumber() +
                               " begins service at time " + clock +
                               ". Time waited is " + timeWaited);
         } // end if
      } // end for
   } // end simulate

    
    public void displayResults()
   {
      System.out.println();
      System.out.println("Number served = " + numberServed);
      System.out.println("Total time waited = " + totalTimeWaited);
      double averageTimeWaited = ((double)totalTimeWaited) / numberServed;
      System.out.println("Average time waited = " + averageTimeWaited);
      int leftInLine = numberOfArrivals - numberServed;
      System.out.println("Number left in line = " + leftInLine);
   }
    
}

