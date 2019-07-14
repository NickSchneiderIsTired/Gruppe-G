package Blatt12.Aufgabe47.Aufgabe47a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener {
    private JCheckBox cb;
    private boolean drawing = false;
    private int x = -1, y = -1;

    public Canvas() {
        cb = new JCheckBox();
        this.add(cb);
        addMouseListener(this);
        this.setBackground(new Color(200, 200, 200));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(x != -1 && y != -1) {
            g.setColor(new Color(0,0,0));
            g.fillOval(x - 10, y - 10, 20, 20);
            System.out.println("painting");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(cb.isSelected()) {
            x = e.getX();
            y = e.getY();
            System.out.println("pressed"+ x + y);
            repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(cb.isSelected()) {
            x = -1;
            y = -1;
            repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
