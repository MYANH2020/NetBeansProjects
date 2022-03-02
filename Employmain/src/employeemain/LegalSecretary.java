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

public class LegalSecretary extends Secretary {
    public double getSalary(){
        return super.getSalary()+ 5000.00;
        
    }
    
    public void fileLegal(){
        System.out.println("I can file");
    }
    
    
    
}
