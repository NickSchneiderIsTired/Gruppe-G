package Blatt8.Aufgabe29.Aufgabe29b;

import java.util.ArrayList;

public class Vorlesung {

    public ArrayList<Student> teilnehmer;

    public void linkTeilnehmer(Student s) {
        if(!teilnehmer.contains(s)) teilnehmer.add(s);
    }

}
