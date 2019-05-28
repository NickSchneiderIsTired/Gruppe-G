package Blatt5.Aufgabe20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Aufgabe20 extends JFrame implements WindowListener {

    JButton close, logButton;
    ArrayList<String> log;
    ShowLog dialog;

    public Aufgabe20() {
        super("Aufgabe20");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        close = new JButton("Close Application");
        logButton = new JButton("Show Log");
        log = new ArrayList<>();

        close.addActionListener(e -> closeWindow());
        logButton.addActionListener(e -> openDialog());

        addWindowListener(this);

        this.add(close);
        this.add(logButton);
        show();
    }

    public static void main(String[] args) {
        new Aufgabe20();
    }

    private void closeWindow() {
        System.exit(0);
    }

    private void openDialog() {
        dialog = new ShowLog(log);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowClosing(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowClosed(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowIconified(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowActivated(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        log.add(e.paramString() + " " + System.currentTimeMillis());
    }
}
