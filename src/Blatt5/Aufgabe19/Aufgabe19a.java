package Blatt5.Aufgabe19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe19a extends JFrame implements ActionListener {

    JOptionPane op;
    JTextField tf;

    public Aufgabe19a() {
        super("Aufgabe19a");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        op = new JOptionPane();
        tf = new JTextField();

        JButton ct = new JButton("Change Title");
        ct.addActionListener(this);

        this.add(ct);

        this.pack();
    }

    public static void main(String[] args) {
        new Aufgabe19a();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String name = op.showInputDialog(this, "Change Title");
        this.setTitle(name);
    }
}
