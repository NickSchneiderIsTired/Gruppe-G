package Blatt12.Aufgabe45;

import Blatt12.LoadSaveException;

import javax.swing.*;
import java.io.*;

public class Aufgabe45a extends JFrame {

    private JFileChooser fc;
    private String filename = null;

    public Aufgabe45a() throws LoadSaveException {
        super("Aufgabe45a");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fc = new JFileChooser();
        int valChooser = fc.showOpenDialog(this);
        if(valChooser == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            filename = file.getPath();
        }
        if(filename != null) {
            try {
                FileWriter writer = new FileWriter(filename);
                writer.append("ok");
                writer.close();
            } catch (IOException e) {
                throw new LoadSaveException("Writing failed", e);
            }
        } else {
            System.out.println("Keine Datei ausgewählt");
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        try {
            new Aufgabe45a();
        } catch (LoadSaveException e) {
            e.printStackTrace();
        }
    }

}
