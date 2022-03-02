/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushcounter;

import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.*;


/**
 *
 * @author anhhuynh
 */
 class PushCounterPanel extends JPanel{
    
     private int count=0;
     private JButton push;
    private JLabel label;
    public PushCounterPanel(){
        count=0;
        push= new JButton("Push me !");
        push.addActionListener(new ButtonListener());
        label= new JLabel("Pushes"+ count);
        add(push);
        add(label);
        setBackground(Color.cyan);
        setPreferredSize( new Dimension(300,400));
        
        
        
    }
    // interface is there to make sure ButtonListener class follow the facts about listening to an object
    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent event) {
           
         count++;
          label.setText("Pushes"+ count);
        }

        
        
    }
    
}
