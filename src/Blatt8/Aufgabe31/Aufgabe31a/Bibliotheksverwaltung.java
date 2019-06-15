package Blatt8.Aufgabe31.Aufgabe31a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Not compilable */
public class Bibliotheksverwaltung extends JFrame implements ActionListener {

    public Bibliotheksverwaltung() {

        Button close = new Button("Close");
        close.addActionListener(this);
        add(close, BorderLayout.CENTER);

        try {
            BuchContainer.instance();
        } catch (LoadSaveException e) {
            dispose();
        }

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}