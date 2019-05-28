package Blatt5.Aufgabe18.Aufgabe18c;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    JTextArea t;

    public MyActionListener(JTextArea t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.append(e.getActionCommand());
    }
}
