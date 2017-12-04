
package multiform;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form extends JFrame implements ActionListener {
    
    private JLabel formLabel = new JLabel("Enter a message");
    private JButton formButton = new JButton("Show message in form 2");
    private JTextField textField = new JTextField(15);
    private JButton closeButton = new JButton ("Close this form");
    
    
    Form (String formName) {
        
       
        setMinimumSize(new Dimension(400,300)); 
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(formName);
       
        
        
        formLabel.setForeground(Color.BLACK);
        formLabel.setFont(new Font("Verdana",Font.BOLD,16));
        formButton.setForeground(Color.white);
        closeButton.setForeground(Color.BLUE);
        textField.setForeground(Color.MAGENTA);
        
        add (formLabel);
        add (textField);
        add (closeButton);
        add (formButton);
        
        setVisible(true);
        
        
        closeButton.addActionListener(this);
        formButton.addActionListener(this);
        
        
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== formButton){
          Form2 f2  =  new Form2("Form 2");
          f2.setMessage(this.textField.getText());
          dispose();
        
        }
       else if (e.getSource()== closeButton){
           dispose();
        }
      
    }
    
    
}
