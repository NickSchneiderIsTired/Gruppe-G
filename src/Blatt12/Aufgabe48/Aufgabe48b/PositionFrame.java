package Blatt12.Aufgabe48.Aufgabe48b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PositionFrame extends JFrame implements MouseMotionListener {

    private JPanel p;

    public PositionFrame() {
        super("PositionFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 500));

        p = new JPanel();
        this.add(p);
        addMouseMotionListener(this);
        this.pack();
    }

    public static void main(String[] args) {
        new PositionFrame();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.setTitle("x: " + e.getX() + " | y: " + e.getY());
    }
}
