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
public class Employee {
    private int years;
    public Employee(int initialYears){
        years= initialYears;
        
    }
    public int getYears(){
        return years;
    }
    public int getHours(){
        return 40;
    }
    public double getSalary(){
        return 50000.00;
    }
    public int getVacationDay(){
        return 10 + 2*getYears();
    }
    public String getVacationForm(){
        return "yellow";
    }
    
}
