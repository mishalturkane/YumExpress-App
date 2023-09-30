package projtopic.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends Frame{
   public MyFrame3() {
     setTitle("Mishal's Frame");
     setBackground(Color.pink);
     setBounds(200,200,400,400);
     Button b1=new Button("Quit");
     Button b2=new Button("Change colour");
     FlowLayout fl=new FlowLayout();

     CloseFrame cf=new CloseFrame();     /** Source Registration **/
     b1.addActionListener(cf);

     setLayout(fl);
     add(b1);
     add(b2);
      setVisible(true);
    }
}
class CloseFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
            System.exit(0);
    }
}
