package Blatt5.Aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Aufgabe18b extends JFrame {

    JTextArea tf;
    JScrollPane p;
    JButton l,r;

    public Aufgabe18b() {
        super("Aufgabe18b");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        l = new JButton("Left Button");
        l.addActionListener(e -> action(e));

        r = new JButton("Right Button");
        r.addActionListener(e -> action(e));

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
        new Aufgabe18b();
    }

    private void action(ActionEvent e) {
        tf.append(e.getActionCommand());
    }

}
