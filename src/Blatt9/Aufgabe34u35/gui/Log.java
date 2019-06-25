package Blatt9.Aufgabe34u35.gui;

import Blatt9.Aufgabe34u35.data.Employee;
import Blatt9.Aufgabe34u35.data.EmployeeContainer;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Log extends JDialog implements PropertyChangeListener {

    private JTextArea ta;
    private EmployeeContainer container;

    public Log(JFrame parent) {
        super(parent);
        setTitle("Log");
        setModal(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        container = EmployeeContainer.instance();
        container.addPropertyChangeListener(this);
        for (Employee e : container) {
            e.addPropertyChangeListener(this);
        }

        ta = new JTextArea(5, 20);
        ta.setEnabled(false);
        add(ta);
        pack();
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        if (e.getPropertyName().equals("employee")) {
            ta.setText("");
            if(e.getOldValue() != null && e.getNewValue() != null) {
                System.out.println("Update");
                ta.insert(((Employee) e.getOldValue()).getName(), 0);
                ta.insert(((Employee) e.getNewValue()).getName(), 1);
            } else if(e.getNewValue() != null){
                System.out.println("New");
                ta.insert(((Employee) e.getNewValue()).getName(), 0);
            } else if(e.getOldValue() != null){
                ta.insert(((Employee) e.getOldValue()).getName(), 0);
            }

        }
    }

}
