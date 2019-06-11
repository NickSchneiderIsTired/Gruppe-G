package Blatt7.Aufgabe28.Aufgabe28a;

import java.util.ArrayList;

public class Student {

    private ArrayList<Studiengang> studien;

    public Student(Studiengang s) throws IllegalArgumentException{
        studien = new ArrayList<>();
        linkStudiengang(s);
    }

    private void linkStudiengang(Studiengang s) throws IllegalArgumentException{
        if(!studien.contains(s)) {
            studien.add(s);
        } else {
            throw new IllegalArgumentException("Studiengang schon eingetragen");
        }
    }

}
