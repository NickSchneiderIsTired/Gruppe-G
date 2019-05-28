package Blatt5.Aufgabe18.Aufgabe18c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aufgabe18c extends JFrame {

    JTextArea tf;
    JScrollPane p;
    JButton l,r;

    public Aufgabe18c() {
        super("Aufgabe18c");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        tf = new JTextArea(5, 20);
        tf.disable();
        tf.setAutoscrolls(false);

        l = new JButton("Left Button");
        l.addActionListener(new MyActionListener(tf));

        r = new JButton("Right Button");
        r.addActionListener(new MyActionListener(tf));

        add(l, BorderLayout.WEST);
        add(r, BorderLayout.EAST);

        p = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //p.add(tf);

        add(p, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String[] args) {
        new Aufgabe18c();
    }

}
