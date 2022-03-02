/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushcounter;

import javax.swing.JFrame;

/**
 *
 * @author anhhuynh
 */
public class PushCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PushCounterPanel panel= new PushCounterPanel();
        frame.getContentPane().add(panel);
        // set the size of the frame
        frame.pack();
        frame.setVisible(true);
        
        // TODO code application logic here
    }
    
}
