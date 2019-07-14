package Blatt12.Aufgabe45;
/*
import Blatt12.LoadSaveException;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Aufgabe45b extends JFrame {

    private String filename = null;

    public Aufgabe45b() {
        super("Aufgabe45b");

    }

    public static void main(String[] args) {
        new Aufgabe45b();
    }

    private BuchContainer load() throws LoadSaveException {
        JFileChooser fc = new JFileChooser();
        int valChooser = fc.showOpenDialog(this);
        if(valChooser == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            filename = file.getPath();
        }
        if(filename != null) {
            try {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename));
                BuchContainer container = reader.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new LoadSaveException("Loading failed", e);
            }
        }
        return container;
    }

}
*/
