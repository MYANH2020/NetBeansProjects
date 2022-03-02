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
public class Lawyer extends Employee {
    public Lawyer( int yearsEmployee){
        super(yearsEmployee);
    }
    public double getSalary(){
        return super.getSalary()+ 5000.00*getYears();
    }
    
    public int getVacationDay(){
        return super.getVacationDay()+ 5;
    }
    public String getVacationForm(){
        return " pink";
    } 
    public void sue(){
        System.out.println(" I'll see you in the court");
    }
    
}
