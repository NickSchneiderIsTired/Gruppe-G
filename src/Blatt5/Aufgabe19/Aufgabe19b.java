package Blatt5.Aufgabe19;

import javax.swing.*;
import java.awt.event.*;

public class Aufgabe19b implements KeyListener {

    JFrame frame;

    public Aufgabe19b() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                 JOptionPane.showMessageDialog(frame, "Close application using the key 'x'");
            }
        });

        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.addKeyListener(this);
        frame.show();
    }

    public static void main(String[] args) {
        new Aufgabe19b();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if(e.getKeyCode() == 88) {
            frame.dispose();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
