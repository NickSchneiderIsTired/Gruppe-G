package Blatt5.Aufgabe17.Aufgabe17a;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame {


    public Frame() {
        super("Aufgabe17a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Font font = new Font("Arial", Font.PLAIN, 20);

        JTextField tf = new JTextField();
        tf.setEditable(true);
        tf.setPreferredSize(new Dimension(20, 20)); //Warum 20?
        tf.setFont(font);

        JLabel label = new JLabel();
        label.setText("Name");
        label.setFont(font);
        label.setVisible(true);

        JPanel north = new JPanel(new GridBagLayout());
        north.setVisible(true);
        north.setBackground(new Color(200, 200, 200));

        north.add(label);
        north.add(tf);

        this.add(north, BorderLayout.NORTH);

        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");

        JPanel south = new JPanel(new FlowLayout());
        south.setBackground(new Color(100, 100, 100));
        south.add(ok);
        south.add(cancel);

        this.add(south);

        pack();
    }
}
