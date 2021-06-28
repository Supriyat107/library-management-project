/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author supriya tiwari
 */
public class LibraryManagementSystem extends JFrame implements ActionListener {
    JLabel l1;
        JButton b1;


    /**
     * @param args the command line arguments
     */
         public LibraryManagementSystem() {
		
                setSize(1500,500);
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1500, 500,Image.SCALE_DEFAULT);
                //(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(1070,250,200,60);
                //(1050,250,200,60)
		l1.setBounds(0, 0, 1500, 500);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
    public static void main(String[] args) {
         LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
        // TODO code application logic here
    
    

