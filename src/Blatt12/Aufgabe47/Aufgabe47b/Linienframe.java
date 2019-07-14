package Blatt12.Aufgabe47.Aufgabe47b;

import javax.swing.*;
import java.awt.*;

public class Linienframe extends JFrame {

    public Linienframe() {
        super("LinienFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(300, 100));

        this.add(new Canvas());

        this.pack();
    }

    public static void main(String[] args) {
        new Linienframe();
    }


}
