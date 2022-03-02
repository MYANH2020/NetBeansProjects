/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author anhhuynh
 */
class FahrenheitPanel extends JPanel{
    private JLabel label1, label2, label3;
    private JTextField Fahrenheit;
    public FahrenheitPanel(){
        label1 = new JLabel(" Enter Fahrenheit temperature :");
        label2= new JLabel(" Temperature in Celsius: ");
        label3= new JLabel("----- ");
        Fahrenheit = new JTextField(7);
        Fahrenheit.addActionListener(new FahrenheitListener());
        add(label1);
        add(Fahrenheit);
        add(label2);
        add(label3);
                
        
    }
    private class FahrenheitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             int fahrenheitTemp, celsiusTemp;
             String text= Fahrenheit.getText();
             // to have the value in the string text we use parese int
             fahrenheitTemp= Integer.parseInt(text);
             celsiusTemp=(fahrenheitTemp-32)*5/9;
             label3.setText(Integer.toString(celsiusTemp));
        }
        
    }
    
    
}
