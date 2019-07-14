package Blatt12.Aufgabe48.Aufgabe48a;

import javax.swing.*;
import java.awt.*;

public class Aufgabe48a extends JFrame {

    public Aufgabe48a() {
        super("KlickFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 100));

        this.add(new Canvas());

        this.pack();
    }

    public static void main(String[] args) {
        new Aufgabe48a();
    }

}
