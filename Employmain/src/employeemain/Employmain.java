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
public class Employmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e= new Employee(4);
        Lawyer l= new Lawyer(2);
        LegalSecretary ls= new LegalSecretary();
        System.out.println(" employee 's salary: "+ e.getSalary());
        System.out.println(" lawyer 's salary: "+ l.getSalary());
        System.out.println("  legal secret 's salary: "+ ls.getSalary());


        // TODO code application logic here
    }
    
}
