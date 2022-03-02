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
public class DriverQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        WaitLine customerLine = new WaitLine();
        customerLine.simulate(6, 0.5, 2);
        customerLine.displayResults();

        System.out.println("\n\nDone.");
    }

}
