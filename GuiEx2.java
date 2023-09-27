package projtopic.gui;

import java.awt.*;

public class GuiEx2 {
    public static void main(String[] args) {
        Frame f=new Frame("Mishal's Frame");
        Button b=new Button("CLick here");
        Color c=new Color(0,255,0);
        f.setBounds(200,200,400,400);
        f.add(b);
        f.setBackground(c);
        f.setLayout(null);
        f.setVisible(true);
    }
}
