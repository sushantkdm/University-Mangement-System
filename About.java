
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame {
    
    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 380, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(395, 10, 250, 345);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(40, 20, 300, 130);
        heading.setForeground(Color.RED);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed By:<br/>Sushant Kadam</html>");
        name.setBounds(40, 175, 300, 100);
        heading.setForeground(Color.BLUE);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("Phone number: 9611628764");
        rollno.setBounds(40, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: sushantkadam936@gmail.com");
        contact.setBounds(40, 320, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
