package hotel.management.system1;

import javax.swing.*;    // to make frames JFRame

import java.awt.*;       // colours

import java.awt.event.*;  // buttons


public class HotelManagementSystem1 extends JFrame implements ActionListener {

    
    // this os constructor and our all coading will be inside constructor
    HotelManagementSystem1(){
     //   setSize(1366,565);  // size    setBound can be used in place of both commands setBound(300,300,400,400)
      //  setLocation(300,300);   // first is x axis of length and second is y axis of width
        
        setBounds(300,300,1366,565);   // set length width and size of frame for picture x axis y axis
        
        // Imageicon is class calling it object to display picture on frame it calls not displays
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system1/icons/first.jpg"));
        
        JLabel l1 = new JLabel(i1);       // calling picture i1 inside Jframe l1 to display picture inside frame
        l1.setBounds(0,0,1366,565);      
        
        setLayout(null); //  set layout to null bydefault it have some values
        
        add(l1);                // add is a fucntion to display 
        
        // writing text on picture
     //   JLabel l2 = new JLabel("WELCOME TO AIR HOTEL");
    //    l2.setBounds(20,450,1000,70);                    // ratio to skip the border from all sides
    //    l2.setForeground(Color.white);       // colour class
    //    l2.setFont(new Font("serif",Font.PLAIN,70));    // font class
    //    l1.add(l2);
        
        // creating button on screen
        
        JButton b1 = new JButton ("ENTER SYSTEM");
     
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1090,450,150,50);
        b1.addActionListener(this);   // we call this so we can pont to current class frame and close it on calling next class frame by clicking button
        
        
        l1.add(b1);
        setVisible(true);   // to show all graphics by default its false
    }
  
  
     // making the button to call nexr login class constructor by implementing Ation performer and lisner
    public void actionPerformed(ActionEvent ae)
    {
        new Login().setVisible(true);
        this.setVisible(false);
        
    }
    
    
    public static void main(String[] args) {
        
        // calling constructor with object 
        new HotelManagementSystem1();
    }
    
}
