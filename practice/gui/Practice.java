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
public class Practice extends Frame implements ActionListener {
    public Practice(){
        setTitle("Mishal's Frame");
        setBounds(400,400,500,500);
        setVisible(true);
        setBackground(Color.lightGray);
        Button b1=new Button("Change Color");
        Button b2=new Button("Quit");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(b1);
        add(b2);
        CloseFrame cf=new CloseFrame();
        b1.addActionListener(this);
        b2.addActionListener(cf);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      setBackground(Color.pink);
    }
}
class CloseFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
    }
    
}
class UsePractice{
    public static void main(String[] args) {
        Practice p=new Practice();
    }
}
