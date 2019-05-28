package Blatt5.Aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe18a extends JFrame implements ActionListener {

    JTextArea tf;
    JScrollPane p;
    JButton l,r;

    public Aufgabe18a() {
        super("Aufgabe18a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        l = new JButton("Left Button");
        l.addActionListener(this);

        r = new JButton("Right Button");
        r.addActionListener(this);

        add(l, BorderLayout.WEST);
        add(r, BorderLayout.EAST);

        tf = new JTextArea(5, 20);
        tf.disable();
        tf.setAutoscrolls(false);

        p = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //p.add(tf);

        add(p, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String[] args) {
        new Aufgabe18a();
    }

    public void actionPerformed(ActionEvent e) {
        tf.append(e.getActionCommand());
    }
}
