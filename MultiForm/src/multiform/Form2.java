
package multiform;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form2 extends JFrame implements ActionListener {
    
    private JLabel formLabel = new JLabel("<no message>");
    private JButton formButton = new JButton("Open form 1");
    private JButton closeButton = new JButton ("Close this form");
    
    
    Form2 (String formName) {
        
       
        setMinimumSize(new Dimension(400,300)); 
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(formName);
       
        
        
        formLabel.setForeground(Color.RED);
        formLabel.setFont(new Font("Verdana",Font.BOLD,32));
        formButton.setForeground(Color.yellow);
        closeButton.setForeground(Color.BLUE);
        
        add (formLabel);
        add (closeButton);
        add (formButton);
        
        setVisible(true);
        
        
        closeButton.addActionListener(this);
        formButton.addActionListener(this);
        
        
        
    }
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()== formButton){
            new Form("Form 2");
        }
       else if (e.getSource()== closeButton){
           dispose();
        }
      
    }
    
        
        public void setMessage(String msg){
            this.formLabel.setText(msg);
            
        }
    
}
