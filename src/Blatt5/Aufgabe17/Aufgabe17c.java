package Blatt5.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class Aufgabe17c {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe17c");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel north = new JPanel(new GridBagLayout());

        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(20, 20));
        tf.disable();

        north.add(tf);

        JPanel south = new JPanel(new GridLayout(0,3));
        for(int i = 0; i < 10; i++) {
            south.add(new JButton("" + i));
        }

        south.add(new JButton("+"));
        south.add(new JButton("-"));
        south.add(new JButton("="));
        south.add(new JButton("."));
        south.add(new JButton("c"));


        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);

        frame.pack();
    }
}
