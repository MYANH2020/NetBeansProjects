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
public class Secretary extends Employee{
    public Secretary(){
        super(0);
    }
    public void takeDictation( String text){
        System.out.println("taking dictation of text: "+ text);
    }

    
}
