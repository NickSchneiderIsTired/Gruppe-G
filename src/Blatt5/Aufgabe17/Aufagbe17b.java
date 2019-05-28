package Blatt5.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class Aufagbe17b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe17b");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        Integer[] options = new Integer[111];
        String def = "(none)";

        for(int i = 0; i < options.length; i++) {
            options[i] = i;
        }

        JPanel p = new JPanel(new FlowLayout());

        JLabel label = new JLabel("Alter");
        JComboBox<Object> box = new JComboBox<>(options);
        box.addItem(def);
        box.setSelectedItem(def);

        p.add(label);
        p.add(box);

        frame.add(p);
        frame.pack();
    }
}
