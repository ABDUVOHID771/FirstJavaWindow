package com.company;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class MyWin extends Frame {
public MyWin(String string){
    super(string);
    setSize(500,500);
    addWindowListener(new WindowAdapter(){
        @Override
                public void windowClosing(WindowEvent event){
            System.exit(0);
        }
    });
}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge=new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall=new Font("SansSerif",Font.ITALIC,12);
        g.setFont(sansSerifLarge);
        g.drawString("THE FIRST JAV WINDOW ",50,50);
        g.setFont(sansSerifSmall);
        g.drawString("THE FIRST JAVA WINDOW",100,100);
    }
}
