/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author misha
 */
public class Practice2 extends Frame implements ActionListener {
    Button b1,b2;
    public Practice2(){
        setTitle("Mishal's Frame");
        setBounds(400,400,500,500);
        setVisible(true);
        setBackground(Color.lightGray);
        b1=new Button("Change Color");
        b2=new Button("Quit");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
          setBackground(Color.red);
       }
       else 
         System.exit(0);
    }
}
class UsePractice2{
    public static void main(String[] args) {
        Practice2 p=new Practice2();
    }
}
