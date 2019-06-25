/*
 *
 * @EmployeeGUI.java 01 16.06.2019 (lorenzro)
 *
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 *
 */

package Blatt9.Aufgabe34u35.gui;

import Blatt9.Aufgabe34u35.data.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@SuppressWarnings("serial")
public class EmployeeGUI extends JFrame implements ActionListener, PropertyChangeListener {

    private static String start = "Register a new Employee or show a list of all Employees";
    private static String isNotSaved = "Changes are NOT SAVED";
    private EmployeeContainer container;
    private JLabel message;
    private JDialog log;

    public EmployeeGUI() {
        super("Employee Manager");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        this.setJMenuBar(mb);

        JMenu m = new JMenu("New");
        mb.add(m);
        JMenuItem register = new JMenuItem("Register New Employee");
        register.addActionListener(this);
        m.add(register);
        JMenuItem showAll = new JMenuItem("Show All Employees");
        showAll.addActionListener(this);
        m.add(showAll);

        JMenu eMenu = new JMenu("Extras");
        mb.add(eMenu);
        JMenuItem startItem = new JMenuItem("Start Logging");
        startItem.addActionListener(this);
        eMenu.add(startItem);

        message = new JLabel("Application Window");
        this.add(message, BorderLayout.CENTER);
        message.setText(start);

        JButton close = new JButton("Close Application");
        close.addActionListener(this);
        this.add(close, BorderLayout.SOUTH);

        container = EmployeeContainer.instance();
        container.addPropertyChangeListener(this);

        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show All Employees")) {
            onList();
        } else if (e.getActionCommand().equals("Register New Employee")) {
            onRegister();
        } else if (e.getActionCommand().equals("Close Application")) {
            onClose();
        } else if(e.getActionCommand().equals("Start Logging")) {
            onLog();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        message.setText(isNotSaved);
    }

    private void onLog() {
        if (container != null)
            new Log(this);
        else
            message.setText("No Data-Objects");
    }

    private void onRegister() {
        if (container != null)
            new RegisterEmployee(this);
        else
            message.setText("No Data-Objects");
    }

    private void onList() {
        if (container != null)
            new ListEmployee(this);
        else
            message.setText("No Data-Objects");
    }

    private void onClose() {
        dispose();
        System.exit(0);
    }
}