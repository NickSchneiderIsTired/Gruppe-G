package Blatt5.Aufgabe20;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowLog extends JDialog {

    JTextArea ta;

    public ShowLog(ArrayList<String> log) {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("Log");

        ta = new JTextArea();
        ta.setColumns(50);
        ta.setRows(5);
        ta.setEnabled(false);
        for(int i = 0; i < log.size(); i++) {
            ta.insert(log.get(i), i);
        }

        add(ta);
        pack();
    }

}
