package Blatt9.Aufgabe36;

import Blatt4.Aufgabe14.GeometricObject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Container {

    private PropertyChangeSupport changes;
    private ArrayList<GeometricObject> geometricObjects;
    private static Container unique = null;
    private Container() {
        changes = new PropertyChangeSupport(this);
    }

    public void link(GeometricObject go) throws IllegalArgumentException {
        if(!geometricObjects.contains(go)) {
            ArrayList<GeometricObject> stash = geometricObjects;
            geometricObjects.add(go);
            changes.firePropertyChange("Add", stash, geometricObjects);
        } else {
            throw new IllegalArgumentException("Already exists");
        }
    }

    public void unlink(GeometricObject go) {
        if(geometricObjects.contains(go)) {
            ArrayList<GeometricObject> stash = geometricObjects;
            geometricObjects.add(go);
            changes.firePropertyChange("Remove", stash, geometricObjects);
        } else {
            throw new IllegalArgumentException("Doesn't exists");
        }
    }

    public static Container instance() {
        if(unique == null) {
            return new Container();
        } else {
            return unique;
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener p) {
        changes.addPropertyChangeListener(p);
    }

}
