/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemain;

/**
 *
 * @author anhhuynh
 */
public class Marketer extends Employee {
    public Marketer( int years){
        super(years);
    }
    public double getSalary(){
        return super.getSalary() + 10000.00;
    }
    public void advertise(){
        System.out.println(" Act");
    }
    
    
}
