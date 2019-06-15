package Blatt5.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class Aufgabe17d {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aufgabe17d");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 200));
        //frame.setSize(200, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("A Menu");
        JMenu submenu = new JMenu("A SubMenu");
        submenu.add("A Menuitem");
        submenu.addSeparator();
        submenu.add(new JCheckBox());

        menu.add(submenu);

        menuBar.add(menu);

        frame.add(menuBar);

        frame.pack();
    }
}
