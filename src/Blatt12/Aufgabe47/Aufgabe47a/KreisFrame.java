package Blatt12.Aufgabe47.Aufgabe47a;

import javax.swing.*;
import java.awt.*;

public class KreisFrame extends JFrame {

    private Canvas canvas;

    public KreisFrame(String title) {
        super(title);
        this.setPreferredSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        canvas = new Canvas();
        this.add(canvas, BorderLayout.CENTER);

        this.pack();
    }

    public static void main(String[] args) {
        new KreisFrame("KreisFrame");
    }

}
