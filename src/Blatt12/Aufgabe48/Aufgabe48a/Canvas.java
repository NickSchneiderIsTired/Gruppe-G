package Blatt12.Aufgabe48.Aufgabe48a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Canvas extends JPanel implements MouseListener {

    int counter = 0;

    public Canvas() {
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        counter++;
        Graphics g = getGraphics();
        g.setColor(new Color(0 ,0 , 0));
        g.drawString("" + counter, e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

//Änderungen für nicht-erhalten bleiben: paintComponent() überschreiben und repaint()
// in mousePressed() aufrufen (siehe letzte Aufgabe)