package Blatt9.Aufgabe36;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Listener implements PropertyChangeListener {

    private Container c;

    public Listener() {
        c = Container.instance();
        c.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        System.out.println(e.getPropertyName() + " " + e.getOldValue() + " " + e.getNewValue());
    }
}
