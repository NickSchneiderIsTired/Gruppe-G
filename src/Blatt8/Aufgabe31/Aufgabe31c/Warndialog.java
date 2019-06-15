package Blatt8.Aufgabe31.Aufgabe31c;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Warndialog extends Dialog {

    public Warndialog(Frame owner) {
        super(owner);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Ok!")) {
            dispose();
        }
    }
}
