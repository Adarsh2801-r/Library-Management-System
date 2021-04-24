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
 * @author BITS-PC
 */
public class LibraryManagementSystem extends JFrame implements ActionListener  {

    /**
     * @param args the command line arguments
     */
    
    JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                setSize(800,700); // setContentPane(300,300,1366,390);   frame size
                setLocation(300,0);
                setLayout(null);

                b1 = new JButton("CONTINUE");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                /*ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/inside-bphc.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);*/
                ImageIcon i2 = new ImageIcon("C:\\Users\\BITS-PC\\Documents\\NetBeansProjects\\Library Management System\\src\\library\\management\\system\\images\\inside-bphc.jpg");
                l1 = new JLabel("",i2,JLabel.CENTER);
                l1.setBounds(0, 0, 800, 700);
                add(l1);
                
                JLabel lid=new JLabel("LIBRARY MANAGEMENT SYSTEM");
                lid.setBounds(160,20,1500,100);
                lid.setFont(new Font("serif",Font.BOLD,30));
                lid.setForeground(Color.white);
                l1.add(lid);
                
                b1.setBounds(625,600,150,50);
                
                l1.add(b1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);
    }
    
}
