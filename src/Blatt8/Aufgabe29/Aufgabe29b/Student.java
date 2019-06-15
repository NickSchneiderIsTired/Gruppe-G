package Blatt8.Aufgabe29.Aufgabe29b;

import java.util.ArrayList;

public class Student {

    public ArrayList<Vorlesung> vorlesung;

    public void linkVorlesung(Vorlesung v) {
        if(!vorlesung.contains(v)) vorlesung.add(v);
    }
}
