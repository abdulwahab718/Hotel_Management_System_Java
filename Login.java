package hotel.management.system1;

import java.awt.Color;
import javax.swing.*;    // to make frames JFRame
import java.awt.*;
import java.awt.event.*;   // to perfrom action on click
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    
    
    
    
    Login()    // constructor
    {
        // login  user
        l1 = new JLabel("Username : ");       
        l1.setBounds(40,20,100,30);
        add(l1);
        
        // password
        l2 = new JLabel("Password : ");       
        l2.setBounds(40,70,100,30);
        add(l2);
        
        // taking text from user
        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);
        
        // taking password froom user
        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        // button  login
        
        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40,150,120,30);
        b1.addActionListener(this);   // added after login class to connect to action
        add(b1);
        
        
        // button Cancel
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(180,150,120,30);
        
        b2.addActionListener(this);    // added after login class to connect to action
        add(b2);
        
        // bring icon 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system1/icons/second.jpg"));
        
        // changing image icon size
        Image i2 =i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        
        // shifting image into icon to change size
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        
        l3.setBounds(350,10,200,200);
        add(l3);
        
        // setting back ground colour to white
        getContentPane().setBackground(Color.white);
        
        
        setLayout(null);
        
        // frame
        setBounds(600,300,600,300);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1)
        {
           String username = t1.getText();
           String password = t2.getText();
           
           conn c = new conn();
           
           String str = "select * from login where username='"+username+"' and password='"+password+"'";
           
           
           
           
           
           
           
           try{
          ResultSet rs = c.s.executeQuery(str);
          
          
          
          
          
          if(rs.next()){ 
                new Dashboard().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
          
          
          
          
          
        }catch(Exception e)
        {
        }   
        else if(ae.getSource()==b2)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
    
    new Login();
    
    
    }
}
